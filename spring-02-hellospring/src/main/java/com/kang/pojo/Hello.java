package com.kang.pojo;

/**
 * @author klr
 * @create 2020-03-18-11:55
 */
public class Hello {
    private String string;

    @Override
    public String toString() {
        return "Hello{" +
                "string='" + string + '\'' +
                '}';
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
