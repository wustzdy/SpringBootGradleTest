package com.wustzdy.spring.boot.gradle.test.service;


public interface I18nService {

    public String getMessage(String msgKey, Object[] args);

    public String getMessage(String msgKey);
}
