package edu.hunau.cxb.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//切面类:通知和切入点的配置
@Aspect //作为切面类存在
public class MyAspect {

    //execution是表达式语言，描述切入点
    //JoinPoint由Spring容器提供，封装目标对象的信息
    @Before("execution(* edu.hunau.cxb.aop.annotation.target.OrderServiceImpl.add*(..))")
    public void beforeAdvice(JoinPoint jp){
        System.out.println("\t[额外功能]:这是前置通知....");
        Signature signature = jp.getSignature();//目标方法的签名
        System.out.println("\t目标方法的方法名:"+signature.getName());
        System.out.println("\t[额外功能]:这是前置通知....");
    }

    //returning声明接收目标方法返回的结果
    @AfterReturning(pointcut = "args(int)",returning = "retVal")
    public void afterAdvice(Object retVal){
        System.out.println("\t[]:这是后置通知....,结果为:"+retVal);
    }

    @Around("execution(* edu.hunau.cxb.aop.annotation.target.*.*(..))")
    public Object round(ProceedingJoinPoint joinPoint)throws Throwable {
        Object result = null;

        System.out.println("\t[额外功能]:这是环绕通知:目标方法执行之前...");
        //执行目标方法
        result = joinPoint.proceed();
        System.out.println("\t[额外功能]:这是环绕通知:目标方法执行之后...");

        return result;
    }

}
