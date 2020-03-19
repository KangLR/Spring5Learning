package com.kang.diy;

import org.springframework.stereotype.Component;

/**
 * @author klr
 * @create 2020-03-19-17:57
 */
public class DiyPointCut {
    public void before(){
        System.out.println("=========方法执行前");
    }
    public void after(){
        System.out.println("=========方法执行后");
    }
}
