package com.lixiaohao.test.other;

import java.io.Serializable;

/**
 * Created by xiaohao.li on 2017/8/7.
 */
public class Error implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 错误code
     **/
    private Integer code;

    /**
     * 错误信息
     **/
    private String message;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Error() {

    }

    public Error(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
