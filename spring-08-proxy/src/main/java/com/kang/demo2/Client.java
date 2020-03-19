package com.kang.demo2;

/**
 * @author klr
 * @create 2020-03-19-11:46
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();

        UserServiceProxy Proxy=new UserServiceProxy();
        Proxy.setUserService(userService);

        Proxy.add();
    }
}
