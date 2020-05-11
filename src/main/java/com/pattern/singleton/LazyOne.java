package com.pattern.singleton;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 22:02
 * @Version 1.0
 * @Deprecated懒汉
 */
public class LazyOne {

    //如果没有使用内部类，内部类是不加载的，
    //那么如何防止被反射调用
    private static boolean initialized = false;

    public LazyOne() {
        synchronized (LazyOne.class){
            if(!initialized){
                initialized = true;
            }else {
                throw new RuntimeException("反射侵入");
            }
        }
    }

    //这是懒汉不安全的，如果想要安全需要加synchronized但是性能有问题
    private static LazyOne lazyOne = null;
    public static LazyOne getInstance(){
        if(lazyOne==null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }

    //要对懒汉进行整改的话需要枷锁,synchronized性能差距很大
    public static synchronized LazyOne getInstanceV1(){
        if(lazyOne==null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }

    //下面使用静态内部类的方法进行处理
    public static final LazyOne getInstanceV2(){
        return Lazy.lazyOne;
    }

    private static class Lazy{
        private static LazyOne lazyOne = new LazyOne();
    }

}
