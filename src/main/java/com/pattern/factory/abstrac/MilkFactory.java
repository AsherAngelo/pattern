package com.pattern.factory.abstrac;

import com.pattern.factory.MengniuMilk;
import com.pattern.factory.Milk;
import com.pattern.factory.SanLuMilk;
import com.pattern.factory.function.MengNiuFactory;
import com.pattern.factory.function.SanluFactory;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 20:56
 * @Version 1.0
 */
public class MilkFactory extends AbstractFactory {

    /**
     * 这里可以不用工厂来创建，只是演示混用而已
     * @return
     */
    @Override
    public Milk getMengniu() {
        //return new MengNiuFactory().getMilk();//也没问题
        return new MengniuMilk();
    }

    @Override
    public Milk getSanlu() {
       // return new SanluFactory().getMilk();
        return new SanLuMilk();
    }
}
