package com.ycit.demo.provider;

import com.ycit.demo.DemoService;

/**
 * @author keda
 * @date 2019/1/23
 */
public class DemoServiceImpl implements DemoService {

    public String sayHi(String name) {
        return "hi, " + name;
    }
}
