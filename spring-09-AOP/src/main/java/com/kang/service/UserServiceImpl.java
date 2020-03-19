package com.kang.service;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author klr
 * @create 2020-03-19-17:20
 */
public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }
}
