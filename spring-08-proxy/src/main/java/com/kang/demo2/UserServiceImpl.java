package com.kang.demo2;

/**
 * @author klr
 * @create 2020-03-19-11:40
 */

//真实角色
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



//    @Override
//    public void query() {
//        System.out.println("[Debug]:调用了query方法");
//        System.out.println("查询了一个用户");
//    }
    //改动原有的业务代码是非常低效，而且在公司中是大忌
    //加一层代理也可以认为是在原有代码的基础上封装了一层

}
