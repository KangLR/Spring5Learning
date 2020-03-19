package com.kang.demo3;

/**
 * @author klr
 * @create 2020-03-19-15:30
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host=new Host();

        //代理角色还没有，ProxyInvocationHandler只是一个处理程序
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //在代理实例上调用方法时，方法被分配到 proxyInvocationHandler的invoke方法
        //通过调用处理程序来处理我们要调用的接口对象
        proxyInvocationHandler.setRent(host);

        //创建代理类
        Rent proxy=(Rent) proxyInvocationHandler.getProxy();//这里的proxy就是动态代理自动生成的，我们并没有写
        proxy.rent();




    }
}
