package com.lixiaohao.test.queue;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-04-08 17:21
 **/

public class Apple {
    private String name;

    public Apple(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
