package com.test.singleton;

/**
 * @Author: zhaomengjie
 * @Date: 2020/7/30 22:48
 * @Version 1.0
 */
public class Hunary {
    private Hunary() {
    }

    private static final Hunary hunary = new Hunary();

    public static Hunary getInstance() {
        return hunary;
    }

}
