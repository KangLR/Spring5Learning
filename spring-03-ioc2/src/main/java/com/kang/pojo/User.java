package com.kang.pojo;

/**
 * @author klr
 * @create 2020-03-18-13:51
 */
public class User {
    private String name;

    public User() {
        System.out.println("User的无参构造");
    }

    public User(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

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
