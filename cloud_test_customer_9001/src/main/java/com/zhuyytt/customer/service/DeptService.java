package com.zhuyytt.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "cloud-test-provider")
public interface DeptService {

    @GetMapping(value = "department/list")
    String departmentList();

}
