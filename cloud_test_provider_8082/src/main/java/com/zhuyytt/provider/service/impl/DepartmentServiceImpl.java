package com.zhuyytt.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhuyytt.api.pojo.Department;
import com.zhuyytt.provider.mapper.DepartmentMapper;
import com.zhuyytt.provider.service.DepartmentService;
import org.springframework.stereotype.Component;

/**
 * DepartmentServiceImpl
 *
 * @author zhuyytt
 * @date 2021/10/26
 */
@Component
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {
}
