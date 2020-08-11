package com.test.factory.abstractfactory;

/**
 * @Author: zhaomengjie
 * @Date: 2020/7/30 23:24
 * @Version 1.0
 */
public class MilkFactory extends AbstractFacorty {
    @Override
    public Milk getSanLu() {
        return new SanluMilk();
    }

    @Override
    public Milk getSanYuan() {
        return new SanYuanMilk();
    }
}
