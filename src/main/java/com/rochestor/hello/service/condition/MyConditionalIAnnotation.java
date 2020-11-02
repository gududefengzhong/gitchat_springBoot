package com.rochestor.hello.service.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mudi
 * @description: conditionalAnnotation
 * @create 2020-09-01 下午8:08
 */

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(MyConditional.class)
public @interface  MyConditionalIAnnotation {
    String key();
    String value();
}
