package com.test.factory.factorymethod;

import com.pattern.factory.MengniuMilk;
import com.pattern.factory.Milk;

/**
 * @Author: zhaomengjie
 * @Date: 2020/7/30 23:30
 * @Version 1.0
 */
public class MengNiuFactory implements Factory{

    @Override
    public Milk getMilk() {
        return new MengniuMilk();
    }
}
