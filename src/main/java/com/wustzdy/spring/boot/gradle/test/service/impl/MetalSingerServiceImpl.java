package com.wustzdy.spring.boot.gradle.test.service.impl;

import com.wustzdy.spring.boot.gradle.test.service.SingerServcice;
import org.springframework.stereotype.Component;

@Component
public class MetalSingerServiceImpl implements SingerServcice {
    @Override
    public String sing(String lyrics) {
        return "I am singing with MetalSingerServiceImpl voice: " + lyrics;
    }
}
