package com.zhuyytt.provider.service;

import com.zhuyytt.provider.service.impl.DepartmentService8083Impl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "cloud-test-provider8083", fallbackFactory = DepartmentService8083Impl.class)
public interface DepartmentService8083 {

    @GetMapping("department/list")
    String departmentList();

}
