package com.wustzdy.spring.boot.gradle.test.service.impl;

import com.wustzdy.spring.boot.gradle.test.service.SingerServcice;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class OperaSingerServiceImpl implements SingerServcice {
    @Override
    public String sing(String lyrics) {
        return "I am singing with OperaSingerServiceImpl voice: " + lyrics;
    }
}
