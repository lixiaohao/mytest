package com.lixiaohao.test.base64;

import org.junit.Before;
import org.junit.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by xiaohao.li on 2017/7/14.
 */
public class Base64Test {
    String str = "1234567qwertyu";

    BASE64Encoder base64Encoder ;
    BASE64Decoder base64Decoder;

    @Before
    public void preDone(){
        base64Encoder = new BASE64Encoder();
        base64Decoder = new BASE64Decoder();
    }
    @Test
    public void encode() throws  IOException{
        String encoderStr = base64Encoder.encode(str.getBytes());
        System.out.println("result :encoder {} " + encoderStr);

        byte[] decoder = base64Decoder.decodeBuffer( encoderStr );

        System.out.println( "result : " +new String(decoder) );
    }

}
