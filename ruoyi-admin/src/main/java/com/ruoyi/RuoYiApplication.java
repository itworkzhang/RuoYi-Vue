package com.ruoyi;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * 启动程序
 * 文档地址:http://doc.ruoyi.vip/ruoyi-vue/
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@Configuration
@EnableApolloConfig
public class RuoYiApplication {


    public static void main(String[] args) {
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("若依项目启动成功!");
    }
}
