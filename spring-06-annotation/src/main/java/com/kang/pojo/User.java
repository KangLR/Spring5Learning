package com.kang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author klr
 * @create 2020-03-18-21:59
 */

//等价于在xml中写 <bean id="user" class="com.kang.pojo.User">
    //id默认小写
@Component
@Scope("singleton")
public class User {
//    public String name="康";
    //相当于<property name="name" value="康"
    @Value("康")
    public String name;

}
