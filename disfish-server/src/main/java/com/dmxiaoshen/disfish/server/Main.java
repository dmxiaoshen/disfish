package com.dmxiaoshen.disfish.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmxia on 2017/6/1.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:dubbo-disfish-provider.xml");
        applicationContext.start();
        System.out.println("start dubbo server--------------------");
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
