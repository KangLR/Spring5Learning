package com.kang.demo4;

import com.kang.demo2.UserService;
import com.kang.demo2.UserServiceImpl;

/**
 * @author klr
 * @create 2020-03-19-15:50
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService=new UserServiceImpl();
        //代理角色，现在不存在，找它的handler去做
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //第一步，设置要代理的真实对象
        proxyInvocationHandler.setTarget(userService);
        //第二步，动态生成代理角色
        //所谓动态就是我们没直接写Proxy类了，而是用下面这一语句直接生成了
        UserService proxy =(UserService) proxyInvocationHandler.getProxy();
        //第三步，调用接口中存在的方法
        proxy.add();
    }
}
