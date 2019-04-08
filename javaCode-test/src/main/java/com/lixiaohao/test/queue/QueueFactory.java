package com.lixiaohao.test.queue;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-04-08 16:58
 **/

public class QueueFactory {
    private static Map<String,ConcurrentLinkedDeque<Object>> queueMap = new ConcurrentHashMap<>();

    /**
     * 获取一个队列
     *
     * doCreate为false，缓存中没有队列，返回null
     * @param k 队列名称
     * @param doCreate  当队列不存在时，是否重新创建，doCreate为true，队列不存在，会创建一个新的队列，为false时，会返回null
     * @return
     */
    public static ConcurrentLinkedDeque<Object> getQueue(String k,Boolean doCreate){
        if ( k == null || k.equals("") ) {
            throw new IllegalArgumentException("获取队列失败,k 不可以为空");
        }

        ConcurrentLinkedDeque<Object> linkedDeque = null;

        linkedDeque = queueMap.get(k);

        if ( doCreate == null ) {
            doCreate = Boolean.TRUE;
        }

        if ( linkedDeque == null && doCreate) {
            linkedDeque = addQueue(k);
        }

        return linkedDeque;
    }


    /**
     * 获取一个队列
     * 如果不存在，则创建一个
     * @param k
     * @return
     */
    public static ConcurrentLinkedDeque<Object> getQueue(String k){
       return getQueue(k,true);
    }

    /**
     * 删除一个队列
     * @param k
     */
    public static void delete(String k){
        if ( k == null || k.equals("") ) {
            throw new IllegalArgumentException("删除队列失败,k 不可以为空");
        }

        ConcurrentLinkedDeque<Object> linkedDeque = queueMap.get(k);
        if ( linkedDeque != null ) {
            queueMap.remove(k);
            linkedDeque = null;
        }
    }


    /**
     * 清空所有队列
     */
    public static void clear(){
        Object[] objects = queueMap.entrySet().toArray();
        queueMap.clear();
        if ( objects!= null ) {
            for ( Object o:objects ) {
                o = null;
            }
        }
    }


    private static ConcurrentLinkedDeque<Object> addQueue(String k){
        ConcurrentLinkedDeque<Object> linkedDeque = new ConcurrentLinkedDeque<>();
        queueMap.put(k,linkedDeque);
        return linkedDeque;
    }

}
