package com.lixiaohao.test.supper;

/**
 * Created by xiaohao.li on 2017/8/1.
 */
public class Animal {

    private String name;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        System.out.println("this is parent!");
    }

    public Animal(String name) {
        this.name = name;
    }
}
