//package com.lixiaohao.test.aes;
//
//import org.junit.Test;
//import org.omg.CORBA.PUBLIC_MEMBER;
//
//import javax.crypto.Cipher;
//import javax.crypto.spec.IvParameterSpec;
//import javax.crypto.spec.SecretKeySpec;
//import java.util.ArrayList;
//import java.util.Base64;
//import java.util.List;
//
///**
// * Created by xiaohao.li on 2017/8/7.
// */
//public class AES {
//
//
//
//    public static String Encrypt(String sSrc, String sKey, String sIv) throws Exception {
//        if(sKey == null) {
//            System.out.print("Key为空null");
//            return null;
//        } else if(sKey.length() != 16) {
//            System.out.print("Key长度不是16位");
//            return null;
//        } else {
//            byte[] raw = sKey.getBytes();
//            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//            IvParameterSpec iv = new IvParameterSpec(sIv.getBytes());
//            cipher.init(1, skeySpec, iv);
//            byte[] encrypted = cipher.doFinal(sSrc.getBytes());
////            byte[] encrypted2 = Base64.encodeBase64(encrypted);
////            return new String(encrypted2);
//        }
//    }
//
//    public static String Decrypt(String sSrc, String sKey, String sIv) throws Exception {
//        try {
//            if(sKey == null) {
//                System.out.print("Key为空null");
//                return null;
//            } else if(sKey.length() != 16) {
//                System.out.print("Key长度不是16位");
//                return null;
//            } else {
//                byte[] raw = sKey.getBytes("ASCII");
//                SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
//                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//                IvParameterSpec iv = new IvParameterSpec(sIv.getBytes());
//                cipher.init(2, skeySpec, iv);
//                byte[] encrypted1 = (new Base64()).decode(sSrc.getBytes());
//                byte[] original = cipher.doFinal(encrypted1);
//                String originalString = new String(original);
//                return originalString;
//            }
//        } catch (Exception var10) {
//            return null;
//        }
//    }
//
//
//
//    public static void main(String[] args) throws Exception {
//        String cKey = "wZTc98PWEMqqCSCs";
//        String sIv  = "0102030405060708";
//        String cSrc = "123QWEasd";
//        System.out.println(cSrc);
//        String enString = Encrypt(cSrc, cKey, sIv);
//        System.out.println("加密后的字串是：" + enString);
//        String DeString = Decrypt(enString, cKey, sIv);
//        System.out.println("解密后的字串是：" + DeString);
//    }
//
//
//    @Test
//    public void decryptTtest()  throws Exception{
//        String cKey = "wZTc98PWEMqqCSCs";
//        String sIv  = "0102030405060708";
//
//        String DeString = Decrypt("z75eOjnx2yeW2sFu0WBXAQ==", cKey, sIv);
//        System.out.println("解密后的字串是：" + DeString);
//    }
//
//
//    @Test
//    public void teststs() {
//       Boolean flag = null;
//       if (flag) {
//           System.out.println("fefaf");
//       }
//
//    }
//
//
//}
