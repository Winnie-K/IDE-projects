package edu.hunau.cxb17.service;

import org.junit.Test;

public class InitClzTest {

    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //通过反射实例化对象
        String classValue = "UserDaoImpl";
        //通过反射获得权限定名对应类对象
        Class<?> clz = Class.forName(classValue);
        //调用无参数构造器实例化对象
        Object instance = clz.newInstance();
        System.out.println(instance);
    }
}


