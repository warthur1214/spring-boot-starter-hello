package com.warthur.hello.service;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * hello 服务类.
 *
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
