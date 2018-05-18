package com.away1994.common.utils.hash;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Hash {

    public static String md5(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(data.getBytes());
        StringBuffer buf = new StringBuffer();
        byte[] bits = md.digest();
        transformBuf(buf, bits);
        return buf.toString();
    }

    public static String sha1(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        md.update(data.getBytes());
        StringBuffer buf = new StringBuffer();
        byte[] bits = md.digest();
        transformBuf(buf, bits);
        return buf.toString();
    }

    public static void transformBuf(StringBuffer buf, byte[] bits) {
        for (byte bit : bits) {
            int a = bit;
            if (a < 0) a += 256;
            if (a < 16) buf.append("0");
            buf.append(Integer.toHexString(a));
        }
    }

}
