package com.ycit.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author keda
 * @date 2019/1/24
 */
public class Provider {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.in.read();
    }

}
