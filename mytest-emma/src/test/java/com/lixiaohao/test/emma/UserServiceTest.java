package com.lixiaohao.test.emma;

import org.junit.Test;

/**
 * Created by xiaohao.li on 2017/8/22.
 */
public class UserServiceTest {

    @Test
    public void saveTest () {
        UserService userService = new UserService();
        userService.save("张三");

    }
}
