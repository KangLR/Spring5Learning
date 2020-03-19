package com.kang.demo1;

/**
 * @author klr
 * @create 2020-03-19-11:06
 */
public class Proxy implements Rent{
    //使用组合的方式
    private Host host;

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public Proxy(Host host) {
        this.host = host;
    }

    //代理帮房东租房子
    @Override
    public void rent() {
        visit();
        host.rent();
        fee();
        contract();
    }

    public void contract(){
        System.out.println("要签租赁合同");
    }
    public void fee(){
        System.out.println("要收中介费");
    }

    public void visit(){
        System.out.println("带客户参观房子");
    }




}
