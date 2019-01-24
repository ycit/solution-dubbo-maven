package com.ycit.demo.impl;

import com.ycit.demo.api.HiService;

/**
 * @author keda
 * @date 2019/1/24
 */
public class HiServiceImpl implements HiService {

    public String sayHi(String name) {
        return "hi, " + name;
    }

}
