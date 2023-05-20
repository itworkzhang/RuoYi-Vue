package com.ruoyi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 启动程序
 * 文档地址:http://doc.ruoyi.vip/ruoyi-vue/
 *
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Configuration
public class RuoYiApplication {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource(name = "threadPoolExecutorMdcWrapper")
    private ThreadPoolExecutor threadPoolExecutor;

    public static void main(String[] args) {
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("若依项目启动成功!");
    }

    @PostConstruct
    public void test() {
        threadPoolExecutor.submit(() -> logger.info("test"));
    }
}
