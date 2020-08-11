package com.test.singleton;

/**
 * @Author: zhaomengjie
 * @Date: 2020/7/30 22:57
 * @Version 1.0
 */
public class StaticInnerClass {
    private StaticInnerClass(){}

    public static final StaticInnerClass getInstance(){
        return InnerClass.ss;
    }

    private static class InnerClass{
        private final static StaticInnerClass ss = new StaticInnerClass();
    }
}
