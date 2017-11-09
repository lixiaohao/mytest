package com.lixiaohao.test.base64;

import org.junit.Test;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by xiaohao.li on 2017/8/3.
 */
public class AppacheCommonBASE64 {

    public String sKey = "das";

    public String sIv = "ff";

    public String sSrc = "123QWEasd";
    @Test
    public void encrypt() {
        try {
            byte[] raw = sKey.getBytes("ASCII");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec(sIv.getBytes());
            cipher.init(2, skeySpec, iv);
//            byte[] encrypted1 = (new Base64()).decode(sSrc.getBytes());
//            byte[] original = cipher.doFinal(encrypted1);
//            String originalString = new String(original);
        }catch (Exception var10) {
            var10.printStackTrace();
        }

    }
}
