package com.warthur.hello.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * hello自动配置类.
 *
 * @author yongqiang.wu
 * @date 2021/05/28
 */
@Component
@ConfigurationProperties(prefix = "hello", ignoreUnknownFields = true)
@Data
public class HelloServiceProperties {

    public static final String MSG = "WORLD";

    private boolean enabled = true;
    private String msg = MSG;
}
