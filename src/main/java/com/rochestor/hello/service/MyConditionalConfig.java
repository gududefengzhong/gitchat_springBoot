package com.rochestor.hello.service;

import com.rochestor.hello.service.condition.MyConditionalIAnnotation;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mudi
 * @description: service
 * @create 2020-09-01 下午8:16
 */

@Configuration
public class MyConditionalConfig {

    @MyConditionalIAnnotation(key = "com.example.conditional", value = "lbl")
    @ConditionalOnClass(MyConditionalService.class)
    @Bean
    public MyConditionalService initMyConditionalService() {
        System.out.println("MyConditionalService 已经加载");
        return new MyConditionalService();
    }
}
