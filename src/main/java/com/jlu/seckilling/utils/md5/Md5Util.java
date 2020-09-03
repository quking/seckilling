package com.jlu.seckilling.utils.md5;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author QuJing
 * @create 2020/3/2
 */
public class Md5Util {

    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    private static final String salt = "1a2b3c4d";

    public static String inputPassFormPass(String inputpass){
        String str = ""+salt.charAt(0)+inputpass+salt.charAt(3)+salt.charAt(7);
        return md5(str);
    }

    public static String formPassToDBpass(String dbpass, String salt){
        String str = ""+salt.charAt(0)+dbpass+salt.charAt(3)+salt.charAt(7);
        return md5(str);
    }

    public static String InputPassToDBpass(String inputpass, String salt){
        String formpass = inputPassFormPass(inputpass);
        String dbpass = formPassToDBpass(formpass,salt);
        return dbpass;
    }

    public static void main(String[] args) {
        System.out.println(inputPassFormPass("455622212"));
    }
}
