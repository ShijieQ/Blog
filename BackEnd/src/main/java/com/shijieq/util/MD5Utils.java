package com.shijieq.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author ShijieQ, on  2021/1/18 23:01
 */
public class MD5Utils {

    /**
     * MD5加密类
     * @param str 要加密的字符串
     * @return    加密后的字符串
     */
    public static String code(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] byteDigest = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            // 32 bits
            return buf.toString();
            // 16 bits
            // return buf.toString().substring(8, 24);
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
