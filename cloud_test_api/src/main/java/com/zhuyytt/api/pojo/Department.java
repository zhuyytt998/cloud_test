package com.zhuyytt.api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Department 简单的部门表
 */
@Data
@Accessors
@TableName("t_department")
public class Department {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * dept_name 部门名称
     */
    private String dept_name;

    /**
     * dept_code 部门编号
     */
    private String dept_code;

    /**
     * db_source 数据库信息
     */
    private String db_source;

}
