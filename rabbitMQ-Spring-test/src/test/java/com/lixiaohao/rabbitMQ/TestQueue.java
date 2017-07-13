package com.lixiaohao.rabbitMQ;

import com.lixiaohao.rabbitMQ.producer.Producer;
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
    private Producer producer;
//    @Value("#{appConfig['mq.queue']}")
    private String queueId = "test_mq";

    @Test
    public void send(){
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("data", "hello rabbitmqfffffffffffffffffffffffff");
            producer.sendQueue("test_exchange",  "test_queue_patt", map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
