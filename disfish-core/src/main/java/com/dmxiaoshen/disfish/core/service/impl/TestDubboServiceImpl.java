package com.dmxiaoshen.disfish.core.service.impl;

import com.dmxiaoshen.disfish.api.service.TestDubboService;

/**
 * Created by dmxia on 2017/6/1.
 */
public class TestDubboServiceImpl implements TestDubboService{
    @Override
    public String say(String hello) {
        return hello;
    }

    @Override
    public int hello() {
        System.out.println("hello dubbo test");
        return 1;
    }
}
