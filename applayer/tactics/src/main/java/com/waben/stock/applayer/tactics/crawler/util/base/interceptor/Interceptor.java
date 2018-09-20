package com.waben.stock.applayer.tactics.crawler.util.base.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Interceptor {
    public Class[] value() ;

    public String success() default "";

    public String failed() default "";
}