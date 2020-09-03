package com.jlu.seckilling.utils.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author QuJing
 * @create 2020/3/2
 */
@Component
@ConfigurationProperties(prefix = "redis")
@Data
public class RedisConfig {

    private String host;
    private int port;
    private int timeout;//秒
    private String password;
    private int poolMaxTotal;
    private int poolMaxIdle;
    private int poolMaxWait;//秒
}
