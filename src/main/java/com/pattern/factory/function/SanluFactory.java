package com.pattern.factory.function;

import com.pattern.factory.Milk;
import com.pattern.factory.SanLuMilk;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 17:03
 * @Version 1.0
 */
public class SanluFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new SanLuMilk();
    }
}
