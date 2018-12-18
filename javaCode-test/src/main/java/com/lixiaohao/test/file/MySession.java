package com.lixiaohao.test.file;

import java.io.Serializable;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-07-25 14:48
 **/

public class MySession implements Serializable{
    private static final long serialVersionUID = -8834975979440969285L;
    private String sessionId;
    private String name;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MySession{" +
                "sessionId='" + sessionId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
