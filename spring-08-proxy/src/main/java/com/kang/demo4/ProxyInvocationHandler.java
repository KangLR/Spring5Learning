package com.kang.demo4;

import com.kang.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author klr
 * @create 2020-03-19-14:24
 */


public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口（真实对象）
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }


    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }



    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());//method是方法的对象，包含了这个方法所有的信息，这里是通过反射实现的

        //调用target接口的方法
        Object result = method.invoke(target, args);
        //System.out.println(method);
        return result;
    }


    //增加个日志功能
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}

//模板
//1.代理谁
//2.生成代理类
//3.调用代理程序的一些方法