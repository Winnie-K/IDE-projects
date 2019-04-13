package edu.hunau.cxb17.mybatis.utils;

import java.util.UUID;

public class UUIDUtils {
    public static String uuid(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-","");
    }
}
