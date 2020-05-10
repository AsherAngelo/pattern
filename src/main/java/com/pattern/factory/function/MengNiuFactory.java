package com.pattern.factory.function;

import com.pattern.factory.MengniuMilk;
import com.pattern.factory.Milk;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 17:04
 * @Version 1.0
 */
public class MengNiuFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new MengniuMilk();
    }
}
