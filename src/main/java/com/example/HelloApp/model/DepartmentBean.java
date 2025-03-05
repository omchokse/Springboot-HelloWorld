package com.example.HelloApp.model;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName = "Engineering";

    public String getDepartmentName() {
        return departmentName;
    }
}
