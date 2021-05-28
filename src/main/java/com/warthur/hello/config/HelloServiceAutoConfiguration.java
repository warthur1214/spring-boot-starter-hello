package com.warthur.hello.config;

import com.warthur.hello.properties.HelloServiceProperties;
import com.warthur.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * hello 自动配置类.
 *
 * @author yongqiang.wu
 * @date 2021/05/28
 */
@Configuration
@EnableConfigurationProperties({HelloServiceProperties.class})
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)
public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloServiceProperties helloServiceProperties;

    /**
     * hello service bean.
     */
    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {

        return new HelloService()
                .setMsg(helloServiceProperties.getMsg());
    }
}
