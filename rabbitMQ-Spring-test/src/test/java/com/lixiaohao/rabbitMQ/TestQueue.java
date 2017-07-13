package com.lixiaohao.rabbitMQ;

import com.lixiaohao.rabbitMQ.producer.MQProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaohao.li on 2017/7/13.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:appContext.xml"})
public class TestQueue {


    @Autowired
    MQProducer mqProducer;

    final String queue_key = "test_queue_key";

    @Test
    public void send(){
        Map<String,Object> msg = new HashMap<String, Object>();
        msg.put("data","hello,rabbmitmq!");
        mqProducer.sendDataToQueue(queue_key,msg);

        System.out.println("fdfad");
    }

}
