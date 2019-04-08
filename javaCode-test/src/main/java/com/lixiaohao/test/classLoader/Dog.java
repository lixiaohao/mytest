package com.lixiaohao.test.classLoader;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-04-08 14:46
 **/

public class Dog extends Animal{
    private Long age = getAge();
    private Long weight;

    private  static String varieties = getVarieties();
    private final String color = "red";


    static {
        System.out.println("第["+ Step.count.getAndIncrement()  +"]步:"+ Dog.class.getName()+"初始化静态块");
    }

    public static String getVarieties(){
        System.out.println("第["+ Step.count.getAndIncrement()  +"]步:"+ Dog.class.getName()+"调用 getVarieties()方法，为varieties赋值");
        return "中华田园犬";
    }

    private Long getAge(){
        System.out.println("第["+ Step.count.getAndIncrement()  +"]步:"+ Dog.class.getName()+"调用 getAge()方法，为age赋值");
        return 10L;
    }

    public Dog() {
        System.out.println("第["+ Step.count.getAndIncrement()  +"]步:"+ Dog.class.getName()+"初始化构造方法");
    }
}
