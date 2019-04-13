package edu.hunau.cxb.aop.proxy.jdk;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CGLIBProxyFactory implements MethodInterceptor{
    //目标对象
    private Object target;

    public CGLIBProxyFactory(Object target){
        this.target=target;
    }

    public Object createProxy(){
        Enhancer enhancer = new Enhancer();//Enhancer增强

        //获得类对象
        enhancer.setSuperclass(target.getClass());
        //设置回调的操作
        enhancer.setCallback(this);//回调是为了执行public Object createProxy() 方法

        return enhancer.create();// create用来创建 以该类为父类的 代理类
    }

    @Override
    public Object intercept(Object obj, Method method,Object[] args, MethodProxy methodProxy)throws Exception{
        System.out.println("\t[额外功能]:日志的记录");
        return method.invoke(target,args);
    }
}
