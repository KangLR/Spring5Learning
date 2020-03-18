package com.kang.pojo;

/**
 * @author klr
 * @create 2020-03-18-16:39
 */
public class People {
    private Cat cat;
    private Dog dog;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat1) {
        this.cat = cat1;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog111(Dog dog) {
        this.dog = dog;
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
