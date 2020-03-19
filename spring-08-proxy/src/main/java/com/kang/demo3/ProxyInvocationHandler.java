package com.kang.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author klr
 * @create 2020-03-19-14:24
 */

//每个代理实例   都有一个关联的   调用处理程序（一个接口）


//等会我们会用这个类自动生成代理类
    //之前我们的代理类是写死的
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    //1.获得类加载器2.获得被代理的接口3.指定handler，将来代理实例调用方法时由handler的invoke方法处理
    public Object getProxy(){
        Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
        return o;
    }



    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {

        seeHouse();
        //动态代理的本质就是使用反射机制实现
        //invoke执行接口上的方法
        Object result = method.invoke(rent, args);

        return result;
    }

    public void seeHouse(){
        System.out.println("中介要看房子");
    }



}
