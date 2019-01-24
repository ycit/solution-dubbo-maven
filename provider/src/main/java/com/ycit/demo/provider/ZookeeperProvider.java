package com.ycit.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author keda
 * @date 2019/1/24
 */
public class ZookeeperProvider {

    public static void main(String[] args)throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"provider-zookeeper.xml"});
        context.start();
        System.in.read();
    }

}
