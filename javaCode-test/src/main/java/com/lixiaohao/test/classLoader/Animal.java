package com.lixiaohao.test.classLoader;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-04-08 14:57
 **/

public class Animal {
    private String name = getName();
    private Boolean isAnimal = Boolean.TRUE;

    private static Long height = getHeight() ;

    static {
        System.out.println( "第["+ Step.count.getAndIncrement()  +"]步:"+ Animal.class.getName()+"初始化静态块");
    }

    public String getName() {
        System.out.println("第["+ Step.count.getAndIncrement()  +"]步:"+ Animal.class.getName()+"调用 getName()方法，为name赋值");
        return "动物";
    }


    public static Long getHeight(){
        System.out.println("第["+ Step.count.getAndIncrement()  +"]步:"+ Animal.class.getName()+"调用 getHeight()方法，为height赋值");
        return 10L;
    }


    public Animal() {
        System.out.println("第["+ Step.count.getAndIncrement()  +"]步:"+ Animal.class.getName()+"初始化构造方法");
    }
}
