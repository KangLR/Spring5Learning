package com.kang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author klr
 * @create 2020-03-18-22:41
 */

//这里不需要@Component
    //@Bean与@Component的作用重复了
    //@Component和@Configuration+@Bean的区别
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("康")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
