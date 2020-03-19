package com.kang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author klr
 * @create 2020-03-19-17:29
 */
public class AfterLog implements AfterReturningAdvice {

    //returnValue：返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法,返回结果为："+returnValue);
    }
}
