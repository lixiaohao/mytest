package com.mybatis.dao;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by xiaohao.li on 2017/9/8.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-application.xml"})
public class UserDaoTest {

    Logger logger = Logger.getLogger("UserDao");
    @Autowired
    private UserDao userDao;

    @Test
    public void findTest () {


        PageHelper.startPage(1,2);
        List<User> users = userDao.find();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        List<User> list = pageInfo.getList();
        logger.info( "数据总数:"  + list.size() );
        logger.info(JSON.toJSONString( list ));

    }



}
