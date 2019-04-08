package com.lixiaohao.test.threadPool;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-01-08 13:00
 **/

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("调用线程");
        }
}
