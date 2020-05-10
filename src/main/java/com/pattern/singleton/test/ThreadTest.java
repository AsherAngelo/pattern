package com.pattern.singleton.test;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 21:50
 * @Version 1.0
 */

import com.pattern.singleton.Hungry;
import com.pattern.singleton.LazyOne;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * 用来测试线程安全问题
 */
public class ThreadTest {
//    public static void main(String[] args) {
//        int count = 100;
//        CountDownLatch countDownLatch = new CountDownLatch(count);
//       // final Set<Hungry> syncSet = Collections.synchronizedSet(new HashSet<>());
//        for(int i=0;i<count;i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    try{
//                        countDownLatch.await();
//                        Hungry.getInstance();
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }.start();
//            countDownLatch.countDown();
//        }
//    }
    //测试懒汉线程安全问题
    //有时会出现同一个时间点出现两个对象
    public static void main(String[] args) {
        int count = 100;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        // final Set<Hungry> syncSet = Collections.synchronizedSet(new HashSet<>());
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        countDownLatch.await();
                        System.out.println(System.currentTimeMillis()+":"+LazyOne.getInstance());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            countDownLatch.countDown();
        }
    }
}
