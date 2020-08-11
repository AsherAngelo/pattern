package com.test.singleton;

/**
 * @Author: zhaomengjie
 * @Date: 2020/7/30 22:52
 * @Version 1.0
 */
public class LazyOne {
    private LazyOne(){}
    private static LazyOne lazyOne = null;
    public static LazyOne getInstance(){
        if(lazyOne==null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }
}
