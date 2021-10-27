package com.zhuyytt.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhuyytt.api.pojo.Department;
import com.zhuyytt.api.utils.ResponseBody;
import com.zhuyytt.provider.service.DepartmentService;
import com.zhuyytt.provider.service.DepartmentService8083;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门
 * @author zhuyytt
 * @date 2021/10/26
 */
@Log4j2
@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    DepartmentService8083 departmentService8083;

    @PostMapping("save")
    public ResponseBody insert(@RequestBody Department department) {
        log.debug("存储部门信息:" + department.toString());
        return ResponseBody.ok(departmentService.save(department));
    }

    @PostMapping("update")
    public ResponseBody update(@RequestBody @Validated Department department) {
        log.debug("修改部门信息:" + department.toString());
        return ResponseBody.ok(departmentService.updateById(department));
    }

    @GetMapping("list")
    @HystrixCommand(fallbackMethod = "listFallBack")
    public ResponseBody list() {
//        List<Department> list = departmentService.list();
        List<Department> list = new ArrayList<>();
        Department department = new Department();
        department.setId(0).setDeptName("8082").setDeptCode("8082");
        list.add(department);
        log.debug("查询部门信息: {}", list.toString());
        return ResponseBody.ok(list);
    }

    @GetMapping("list8083")
    public ResponseBody list8083() {
        return ResponseBody.ok(departmentService8083.departmentList());
    }

    public ResponseBody listFallBack() {
        log.debug("8082：服务器停止运作或异常！");
        return ResponseBody.fail("8082：服务器停止运作或异常！");
    }

    @GetMapping("delete/{id}")
    public ResponseBody list(@PathVariable("id") Integer id) {
        boolean b = departmentService.removeById(id);
        log.debug("删除 ID 为: {} 部门信息", id);
        return ResponseBody.ok(b);
    }

}
