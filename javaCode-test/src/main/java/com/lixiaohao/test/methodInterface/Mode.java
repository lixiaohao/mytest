package com.lixiaohao.test.methodInterface;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-29 10:25
 **/

public class Mode {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mode{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
