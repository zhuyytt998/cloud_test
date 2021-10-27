package com.zhuyytt.provider.service.impl;

import com.zhuyytt.provider.service.DepartmentService8083;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class DepartmentService8083Impl implements FallbackFactory<DepartmentService8083> {
    @Override
    public DepartmentService8083 create(Throwable throwable) {
        return new DepartmentService8083() {
            @Override
            public String departmentList() {
                return "服务器繁忙！请稍后重试！";
            }
        };
    }
}
