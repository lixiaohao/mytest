package com.mybatis.model;

import java.io.Serializable;

/**
 * Created by xiaohao.li on 2017/9/8.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 7157887960414025286L;
    private int id;
    private String userName;
    private String userPass;
    private int     userAge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
