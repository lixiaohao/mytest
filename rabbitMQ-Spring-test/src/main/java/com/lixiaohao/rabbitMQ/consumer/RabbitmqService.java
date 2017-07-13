package com.lixiaohao.rabbitMQ.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * Created by xiaohao.li on 2017/7/13.
 */
@Component
public class RabbitmqService implements MessageListener {
    public void onMessage(Message message) {
        System.out.println("消息消费者 = " + message.toString());
    }
}
