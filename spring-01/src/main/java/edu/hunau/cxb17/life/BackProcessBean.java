package edu.hunau.cxb17.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BackProcessBean implements BeanPostProcessor {
    /**
     * @param obj:当前作用的bean的实例
     * @param name:表示当前bean的id/name的值
     */
    public Object postProcessAfterInitialization(Object obj, String name)
            throws BeansException {
        System.out.println(
                "[第8步]:BeanPostProcessor#postProcessAfterInitialization方法执行"
                        + obj + ",name=" + name);
        return obj;
    }
    @Override
    public Object postProcessBeforeInitialization(Object obj, String name)
            throws BeansException {
        System.out.println(
                "[第5步]:BeanPostProcessor#postProcessBeforeInitialization方法执行"
                        + obj + ",name=" + name);
        return obj;
    }
}

