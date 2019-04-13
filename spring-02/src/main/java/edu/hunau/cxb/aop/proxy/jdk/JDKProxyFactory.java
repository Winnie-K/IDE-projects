package edu.hunau.cxb.aop.proxy.jdk;

import java.lang.reflect.Proxy;

//JDK底层动态代理的实现
public class JDKProxyFactory {
    //目标对象
    private Object target;

    public JDKProxyFactory(Object target) {
        super();
        this.target = target;
    }

    //返回动态代理对象
    public Object createProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                // method是目标方法 args:参数 返回结果是目标方法的执行结果
                ( proxy,  method, args) ->{
                    System.out.println("\t[额外功能]开启事务....");
                    // 执行目标方法
                    Object result = method.invoke(target, args);
                    System.out.println("\t[额外功能]提交事务....");
                    return result;
                }
        );
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}