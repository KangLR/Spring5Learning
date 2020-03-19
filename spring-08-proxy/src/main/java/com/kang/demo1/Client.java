package com.kang.demo1;

/**
 * @author klr
 * @create 2020-03-19-11:04
 */
public class Client {
    public static void main(String[] args) {
        //原来没有中介，我们直接找房东
//        Host host=new Host();
//        host.rent();


        //现在有了中介
        Host host=new Host();//它是客观存在的，你可以认为它是你挑选的房子

        //代理，除了帮房东租房还有一些附属操作
        Proxy proxy=new Proxy(host);

        //你不用面对房东，直接找中介租房即可
        proxy.rent();

    }
}
