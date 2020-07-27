package com.wustzdy.spring.boot.gradle.test.controller;

import com.wustzdy.spring.boot.gradle.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/Qualifier")
public class EmployeeInfoController {
    @Autowired
//    @Resource(name = "EmployeeServiceISecondmpl")
    @Qualifier("EmployeeServiceISecondmpl")
    private EmployeeService employeeService;

    @RequestMapping("/test")
    public void showEmplayeeInfo(String id) {
        employeeService.getEmployeeById(id);
    }
}
/**
 * @Qualifier 先声明后使用，相当于多个实现起多个不同的名字，注入时候告诉我你要注入哪个
 * 接口对应的两个实现类：EmployeeServiceIFirstmpl和EmployeeServiceISecondmpl：
 * 这个时候就要用到@Qualifier注解了，qualifier的意思是合格者，通过这个标示，表明了哪个实现类才是我们所需要的，
 * 我们修改调用代码，添加@Qualifier注解，需要注意的是@Qualifier的参数名称必须为我们之前定义@Service注解的名称之一！
 * 以下两者等价
 * @Resource(name = "EmployeeServiceISecondmpl")
 * @Qualifier("EmployeeServiceISecondmpl")
 **/