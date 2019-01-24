package com.ycit.demo.consumer;

import com.ycit.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author keda
 * @date 2019/1/23
 */
public class ZookeeperConsumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer-zookeeper.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHi("world");
        // Display the call result
        System.out.println(hello);
    }

}
