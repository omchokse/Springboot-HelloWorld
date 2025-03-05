package com.example.HelloApp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private DepartmentBean departmentBean;

    // Constructor Injection
    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public String getEmployeeDetails() {
        return "Employee belongs to " + departmentBean.getDepartmentName() + " Department";
    }
}
