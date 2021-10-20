package com.zhuyyt.provider8081.controller;

import com.zhuyyt.provider8081.service.DepartmentService;
import com.zhuyytt.api.pojo.Department;
import com.zhuyytt.api.utils.ResponseBody;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("save")
    public ResponseBody<Boolean> insert(@RequestBody Department department) {
        return ResponseBody.ok(departmentService.save(department));
    }

}
