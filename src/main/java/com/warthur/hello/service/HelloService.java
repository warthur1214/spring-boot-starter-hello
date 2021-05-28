package com.warthur.hello.service;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author yongqiang.wu
 * @date 2021/05/28
 */
@Data
@Accessors(chain = true)
public class HelloService {

    private String msg;

    public String sayHello() {

        return "hello " + msg;
    }
}
