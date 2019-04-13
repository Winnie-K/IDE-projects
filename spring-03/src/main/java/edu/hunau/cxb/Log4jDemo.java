package edu.hunau.cxb;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Log4jDemo {

    //日志记录器
    private static Logger LOGGER = LogManager.getLogger(Log4jDemo.class);

    public void show(){
        //输出日志信息，测试日志级别的作用（配置在配置文件中），仅仅输出大于等于目前有效级别的日志信息
        LOGGER.debug("[1]-my level is DEBUG 天");
        LOGGER.info("[2]-my level is INFO");
        LOGGER.warn("[3]-my level is WARN");
        LOGGER.error("[4]-my level is ERROR");
    }
}
