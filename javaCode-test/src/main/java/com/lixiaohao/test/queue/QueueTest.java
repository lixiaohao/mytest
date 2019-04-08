package com.lixiaohao.test.queue;

import org.junit.Test;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-04-08 17:16
 **/

public class QueueTest {


    @Test
    public void testQueue(){
        //模拟创建一个 队列 0001
        String k1 = "0001";
        stringQueue(k1);

        //模拟创建一个 队列 0002
        String k2  = "0002";
        modelQueue(k2);


        //获取队列并从队列中读取数据

        ConcurrentLinkedDeque<Object> queue = QueueFactory.getQueue(k1);
        System.out.println(queue.peek());

        ConcurrentLinkedDeque<Object> queue1 = QueueFactory.getQueue(k2);
        System.out.println(queue1.peek().toString());


    }


    public void stringQueue(String name){
        ConcurrentLinkedDeque<Object> stringQueue = QueueFactory.getQueue(name, true);
        stringQueue.offer("001");
        stringQueue.offer("002");
        stringQueue.offer("003");
    }


    public void modelQueue(String name){
        ConcurrentLinkedDeque modelQueue = QueueFactory.getQueue(name, true);
        modelQueue.offer(new Apple("apple1") );
        modelQueue.offer(new Apple("apple2") );
        modelQueue.offer(new Apple("apple3") );

    }
}
