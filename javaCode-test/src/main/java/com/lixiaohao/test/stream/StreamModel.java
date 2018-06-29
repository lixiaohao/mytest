package com.lixiaohao.test.stream;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-07 21:32
 **/

public class StreamModel {
    private long age;
    private long length;
    private String name;

    public StreamModel(long age, long length, String name) {
        this.age = age;
        this.length = length;
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StreamModel{" +
                "age=" + age +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
