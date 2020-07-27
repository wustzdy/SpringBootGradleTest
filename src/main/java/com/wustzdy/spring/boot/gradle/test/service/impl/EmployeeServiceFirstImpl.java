package com.wustzdy.spring.boot.gradle.test.service.impl;

import com.wustzdy.spring.boot.gradle.test.dto.EmployeeDto;
import com.wustzdy.spring.boot.gradle.test.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service("EmployeeServiceFirstImpl")
public class EmployeeServiceFirstImpl implements EmployeeService {
    @Override
    public EmployeeDto getEmployeeById(String id) {
        System.out.println("EmployeeServiceFirstImpl....... " + id);
        return null;
    }
}
