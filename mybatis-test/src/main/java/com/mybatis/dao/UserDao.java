package com.mybatis.dao;


import com.mybatis.model.User;

import java.util.List;

/**
 * Created by xiaohao.li on 2017/6/27.
 */
//@Repository("userDao")
public interface UserDao {
    void insertUser(User user);

    List<User> find();

    List<User> findPage(int start, int limit);

    List<User> queryPage(String name, int start, int limit);
}
