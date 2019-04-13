package edu.hunau.cxb.aop.old;

import org.aopalliance.intercept.MethodInvocation;
import org.aopalliance.intercept.MethodInterceptor;

//对于用户业务逻辑提供额外功能
public class TxAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable{
        Object target = null;
        System.out.println("\t[额外功能]:开启事务");
        target = methodInvocation.proceed();
        System.out.println("\t[额外功能]:提交事务");
        return  target;

    }
}
