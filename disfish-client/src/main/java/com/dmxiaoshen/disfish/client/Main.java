package com.dmxiaoshen.disfish.client;

import com.dmxiaoshen.disfish.api.service.TestDubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmxia on 2017/6/1.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:dubbo-disfish-consumer.xml");
        applicationContext.start();
        TestDubboService testDubboService = applicationContext.getBean(TestDubboService.class);
        while (true){
            testDubboService.hello();
            System.out.println(testDubboService.say("ni hao ma?"));
        }
    }
}
