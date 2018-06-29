package com.lixiaohao.test.other;

public class CloneMode implements Cloneable{
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

    public CloneMode clone(){
        CloneMode o = null;

        try {
            o  =  (CloneMode) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return o;
    }

    @Override
    public String toString() {
        return "CloneMode{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
