package edu.hunau.cxb.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;


public class MyAspect {

    public void beforeAdvice(JoinPoint jp){
        System.out.println("\t[额外功能]:这是前置通知....");
        Signature signature = jp.getSignature();//目标方法的签名
        System.out.println("\t目标方法的方法名:"+signature.getName());
        System.out.println("\t[额外功能]:这是前置通知....");
    }

    public void afterAdvice(Object retVal){
        System.out.println("\t[]:这是后置通知....,结果为:"+retVal);
    }


    public Object round(ProceedingJoinPoint joinPoint)throws Throwable {
        Object result = null;
        System.out.println("\t[额外功能]:这是环绕通知:目标方法执行之前...");
        //执行目标方法
        result = joinPoint.proceed();
        System.out.println("\t[额外功能]:这是环绕通知:目标方法执行之后...");
        return result;
    }

}
