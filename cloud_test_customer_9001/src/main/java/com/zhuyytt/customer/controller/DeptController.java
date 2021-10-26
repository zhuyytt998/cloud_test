package com.zhuyytt.customer.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zhuyytt.api.utils.ResponseBody;
import com.zhuyytt.customer.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class DeptController {

    @Autowired
    DeptService deptService = null;

    @GetMapping("dept/list")
    private ResponseBody deptList() {
        return ResponseBody.ok(deptService.departmentList());
    }

}
