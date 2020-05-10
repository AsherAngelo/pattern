package com.pattern.singleton;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 21:41
 * @Version 1.0
 * @Deprecated 饿汉模式
 * 在示例之前，不管用户用都先new出来，避免线程安全问题
 */
public class Hungry {
    private Hungry(){
    }
    //累加载顺序
    //先静态后动态，先属性后方法，先上后下
    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        System.out.println(System.currentTimeMillis()+":"+hungry);
        return hungry;
    }

    /**
     * 所有的单例模式都可以加上这个，这个是用来处理序列化与反序列化后对象不是同一个了的问题
     * 为了对象的重复利用
     * @return
     */
    private Object readResolve(){
        return hungry;
    }


}
