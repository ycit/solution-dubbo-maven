package com.ycit.source.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.ycit.source.spi.java.Robot;
import org.junit.Test;

import java.util.ServiceLoader;

/**
 * @author chenxiaolei
 * @date 2019/5/31
 */
public class SpiTest {

    @Test
    public void javaSpiTest()throws Exception {

        ServiceLoader<Robot> loader = ServiceLoader.load(Robot.class);
        System.out.println("java spi");
        loader.forEach(Robot::sayHi);
    }

    @Test
    public void dubboSpiTest() {
        ExtensionLoader<Robot> loader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot ssx = loader.getExtension("ssx");
        ssx.sayHi();
    }

}
