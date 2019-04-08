package com.lixiaohao.test.syn;

import org.junit.Test;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-03-06 11:08
 **/

public class SyncTest {

    @Test
    public void test001(){
        DemoModel demoModel = new DemoModel();

        for (int i = 0 ;i < 5000;i++) {

            new Thread(){
                @Override
                public void run(){
                    demoModel.increase();
                }
            }.start();
            System.out.println("==================> i:"+demoModel.getId());
        }


    }

    @Test
    public void test002(){

        for (int i = 0 ;i < 1000;i++) {

            new Thread(){
                @Override
                public void run(){
                    DemoModel.singleton();
                }
            }.start();
        }


    }




}
