package com.lixiaohao.test.threadPool;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-01-08 12:57
 **/

public class ThreadPool {

    public static void main(String[] args) {

        //初始化一个线程池，线程数为 5
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        int len = 100;
        for (int i=0 ; i<=len;i++ ) {

            final int index = i;

            //提交一个新线程
            executorService.execute(new Runnable() {

                //这里面写处理逻辑业务
                @Override
                public void run() {

                    System.out.println("开始执行线程："+ index);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    System.out.println("线程执行完成："+ index );


                    //当满足条件是终止所有线程
                    if ( index == 50 ) {
                        System.out.println("线程准备结束");
                        executorService.shutdownNow();
                        System.out.println("线程已经结束");
                    }

                }
            });


            System.out.println("第"+index+"次循环");

        }

    }

}
