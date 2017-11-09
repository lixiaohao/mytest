package com.lixiaohao.test.exception;

/**
 * Created by xiaohao.li on 2017/8/1.
 */
public class ServiceException extends RuntimeException {

    //错误代码
    private String code;

    //错误信息
    private String message;


    public ServiceException() {
    }

    public ServiceException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
