package edu.hunau.cxb17.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLife implements BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void doSometing() {
        System.out.println("[第9步]:doSometing方法执行,业务逻辑");
    }

    // 初始化方法
    public void init() {
        System.out.println("[第7步]:init方法执行");
    }

    // 自定义的释放资源的方法
    public void myDestory() {
        System.out.println("[第11步]:myDestory方法执行");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("[第2步]:调用setter方法为属性赋值");
    }

    public BeanLife() {
        super();
        System.out.println("[第1步]对象实例化");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("[第3步]:BeanNameAware#setBeanName方法执行" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        System.out.println(
                "[第4步]:ApplicationContextAware#setApplicationContext方法执行,获得spring上下文对象");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(
                "[第6步]:InitializingBean#afterPropertiesSet方法执行,属性设置完毕之后,追加功能");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[第10步]:DisposableBean#destory,释放资源");

    }

}

