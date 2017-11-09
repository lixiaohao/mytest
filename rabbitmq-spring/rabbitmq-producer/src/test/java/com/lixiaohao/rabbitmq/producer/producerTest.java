package com.lixiaohao.rabbitmq.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaohao.li on 2017/9/19.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class producerTest {

    @Autowired
    private Producer producer;

    @Test
    public void send(){
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("data", "test message 3");
            producer.sendQueue("test_exchange",  "test.rabbitmq.1", map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
