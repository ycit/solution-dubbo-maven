package com.ycit.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author keda
 * @date 2019/1/23
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider-zookeeper.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
