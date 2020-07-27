package com.wustzdy.spring.boot.gradle.test.service.impl;

import com.wustzdy.spring.boot.gradle.test.dto.EmployeeDto;
import com.wustzdy.spring.boot.gradle.test.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service("EmployeeServiceISecondmpl")
public class EmployeeServiceISecondmpl implements EmployeeService {
    @Override
    public EmployeeDto getEmployeeById(String id) {
        System.out.println("EmployeeServiceISecondmpl....... " + id);
        return null;
    }
}
