package com.kang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author klr
 * @create 2020-03-18-16:39
 */
public class People {

    //如果显式的定义了required属性为false，说明这个对象可以为null，否则不允许为空
//    @Autowired(required = false)
    @Autowired
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog22")
    private Dog dog;
    private String name;
    //使用注解后我们不再需要set方法，因为注解是用反射实现的
    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
