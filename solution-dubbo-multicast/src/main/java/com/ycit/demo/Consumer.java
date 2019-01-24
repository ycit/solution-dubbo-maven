package com.ycit.demo;

import com.ycit.demo.api.HiService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author keda
 * @date 2019/1/24
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        HiService hiService = (HiService) context.getBean("hiService");
        String hi = hiService.sayHi("world");
        System.out.println(hi);
    }

}
