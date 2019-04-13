package edu.hunau.cxb17.annotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@DependsOn("noo") //初始化Moo时，先实例化Noo
@Component  //默认的名称为类名的小驼峰形式
@Scope("prototype")
public class Moo {

    //使用Value标签进行注解,不用提供getter和setter方法，也不管值得属性范围
    @Value("is string")
    private String strs;

    @Value("1234")
    private int ints;

    @Value("1234")
    private Integer nums;

    @Value("'wangfei','lily','lucy'")
    private List<String> lists;

    @Resource(name="maps")
    private Map<Integer,String> maps;


    @DependsOn
    public void init(){
        System.out.println("----初始化方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("----销毁方法");
    }

    @Override
    public String toString() {
        return "Moo{" +
                "strs='" + strs + '\'' +
                ", ints=" + ints +
                ", nums=" + nums +
                ", lists=" + lists +
                ", maps=" + maps +
                '}';
    }
}

