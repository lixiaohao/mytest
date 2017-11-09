package com.lixiaohao.test.supper;

/**
 * Created by xiaohao.li on 2017/8/1.
 */
public class Dog extends Animal {

    private String age;

    public Dog(){
        System.out.println("this is a dog!");
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
