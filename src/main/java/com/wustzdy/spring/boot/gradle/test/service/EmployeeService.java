package com.wustzdy.spring.boot.gradle.test.service;

import com.wustzdy.spring.boot.gradle.test.dto.EmployeeDto;

public interface EmployeeService {
    public EmployeeDto getEmployeeById(String id);
}
