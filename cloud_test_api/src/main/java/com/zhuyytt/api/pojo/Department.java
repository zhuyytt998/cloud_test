package com.zhuyytt.api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * Department 简单的部门表
 *
 * @author zhuyytt
 * @date 2021/10/26
 */
@Getter
@Setter
@TableName("t_department")
public class Department extends Base {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * dept_name 部门名称
     */
    @NotBlank(message = "部门名称不能为空")
    private String deptName;

    /**
     * dept_code 部门编号
     */
    @NotBlank(message = "部门编号不能为空")
    private String deptCode;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", dbSource='" + getDbSource() + '\'' +
                ", createTime='" + getCreateTime() + '\'' +
                ", updateTime='" + getUpdateTime() + '\'' +
                '}';
    }
}
