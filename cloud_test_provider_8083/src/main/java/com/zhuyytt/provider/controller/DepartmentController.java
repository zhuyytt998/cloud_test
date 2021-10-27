package com.zhuyytt.provider.controller;

import com.zhuyytt.api.utils.ResponseBody;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门
 * @author zhuyytt
 * @date 2021/10/26
 */
@Log4j2
@RestController
@RequestMapping("department")
public class DepartmentController {

    @GetMapping("list")
    public ResponseBody list() throws Exception {
        return ResponseBody.ok("{id:0,deptName:'8083',deptCode:'8083'}");
    }

    public ResponseBody listFallBack() {
        log.debug("8081：服务器停止运作或异常！");
        return ResponseBody.fail("8081：服务器停止运作或异常！");
    }

}
