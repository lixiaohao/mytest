package com.lixiaohao.test.methodInterface;

import java.util.Arrays;

public enum StatusEnum {
    RESULT_OK(200,"success"),
    RESULT_ERROR(500,"error");
    private int code;
    private String message;

    StatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    static StatusEnum getEnumByMessage(String message){
        return doIt(message,p -> p.getMessage().equals(message));
    }

    static StatusEnum getEnumByCode(int code){
        return doIt(code,(p)-> p.code==code);
    }


    private static StatusEnum doIt(Object code,DoInterface doInterface){
         return Arrays.stream(StatusEnum.values())
                 .filter(statusEnum -> doInterface.isMatch(statusEnum))
                 .findFirst()
                 .orElse(null);
      }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    interface DoInterface {
        boolean isMatch(StatusEnum statusEnum);
    }

}
