package com.ruoyi.common.trace;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池配置
 *
 * @author ruoyi
 */
@Configuration
public class ThreadPoolConfig {
    // 核心线程池大小
    private int corePoolSize = 50;

    // 最大可创建的线程数
    private int maxPoolSize = 200;

    // 队列最大长度
    private int queueCapacity = 1000;

    // 线程池维护线程所允许的空闲时间
    private int keepAliveSeconds = 300;


    /**
     * 带有traceId的线程池
     *
     * @return the thread pool executor
     */
    @Bean(name = "threadPoolExecutorMdcWrapper")
    public ThreadPoolExecutor threadPoolExecutor(){
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutorMdcWrapper(corePoolSize,maxPoolSize,keepAliveSeconds,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(queueCapacity),new ThreadPoolExecutor.CallerRunsPolicy());
        return threadPoolExecutor;
    }

}
