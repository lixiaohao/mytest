package com.lixiaohao.rabbitMQ.consumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * Created by xiaohao.li on 2017/7/13.
 */


@Component
public class RabbitmqService implements ChannelAwareMessageListener {
    Logger logger = Logger.getLogger("RabbitmqService");

    public void onMessage(Message message, Channel channel) throws Exception {
        System.out.println("消息消费者 = " + message.toString());
        try {

            //处理成功，手动设置返回成功
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
        }catch (Exception e){
            e.getMessage();
            //消息处理异常
            channel.basicNack(message.getMessageProperties().getDeliveryTag(),false,true);
        }

        logger.info("呵呵！");
    }
    }


//@Component
//public class RabbitmqService implements MessageListener {
//    Logger logger = Logger.getLogger("RabbitmqService");
//    public void onMessage(Message message) {
//
////        System.out.println("消息消费者 = " + message.toString());
//        try {
//            throw  new IllegalAccessException("测试");
//
//        }catch (Exception e){
//            e.getMessage();
//        }
//
//        logger.info("呵呵！");
//    }
//}
