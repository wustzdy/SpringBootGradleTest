package com.wustzdy.spring.boot.gradle.test.controller;

import com.wustzdy.spring.boot.gradle.test.service.SingerServcice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primary")
public class SingerController {
    @Autowired
    private SingerServcice singerServcice;

    @RequestMapping("/test")
    public String testPrimary(String id) {
        return singerServcice.sing(id);
    }
}
/**
 * 二、@Primary：和@Qualifier 一样，@Primary也一样，使用场景经常是：在spring 中使用注解，常使用@Autowired， 默认是根据类型Type来自动注入的。但有些特殊情况，对同一个接口，可能会有几种不同的实现类，而默认只会采取其中一种的情况下 @Primary 的作用就出来了。
 * ————————————————
 * 原文链接：https://blog.csdn.net/sinat_32023305/java/article/details/90718687
 */