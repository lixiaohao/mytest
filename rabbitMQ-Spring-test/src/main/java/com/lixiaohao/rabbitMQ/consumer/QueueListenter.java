package com.lixiaohao.rabbitMQ.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.misc.Contended;

/**
 * Created by xiaohao.li on 2017/7/13.
 */
@Component("queueListenter")
public class QueueListenter implements MessageListener {
    @Override
    public void onMessage(Message msg) {
        try{
            System.out.print(msg.toString()  + "msg: {} "+msg.getBody());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
