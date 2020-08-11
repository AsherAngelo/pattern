package com.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.omg.IOP.Codec;


class ShareData//资源类
{
    private int number = 0;//初始值为零的一个变量

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {

        lock.lock();
        try {
            //判断
            while (number != 0) {
                condition.await();
            }
            //干活
            ++number;
            System.out.println(Thread.currentThread().getName() + " \t " + number);
            //通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


    public void decrement() throws InterruptedException {

        lock.lock();
        try {
            //判断
            while (number != 1) {
                condition.await();
            }
            //干活
            --number;
            System.out.println(Thread.currentThread().getName() + " \t " + number);
            //通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

  /*public synchronized void increment() throws InterruptedException
  {
     //判断
     while(number!=0) {
       this.wait();
     }
     //干活
     ++number;
     System.out.println(Thread.currentThread().getName()+" \t "+number);
     //通知
     this.notifyAll();;
  }

  public synchronized void decrement() throws InterruptedException
  {
     //判断
     while(number!=1) {
       this.wait();
     }
     //干活
     --number;
     System.out.println(Thread.currentThread().getName()+" \t "+number);
     //通知
     this.notifyAll();
  }*/
}

/**
 * @Description: 现在两个线程，
 * 可以操作初始值为零的一个变量，
 * 实现一个线程对该变量加1，一个线程对该变量减1，
 * 交替，来10轮。
 * <p>
 * * 笔记：Java里面如何进行工程级别的多线程编写
 * 1 多线程变成模板（套路）-----上
 * 1.1  线程    操作    资源类
 * 1.2  高内聚  低耦合
 * 2 多线程变成模板（套路）-----下
 * 2.1  判断
 * 2.2  干活
 * 2.3  通知
 */
public class NotifyWaitDemo {
    public static void main(String[] args) {
        ShareData sd = new ShareData();
        new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                try {
                    sd.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                try {
                    sd.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
        new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                try {
                    sd.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
        new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                try {
                    sd.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();

    }
}





/*
 * *
 * 2 多线程变成模板（套路）-----下
 *     2.1  判断
 *     2.2  干活
 *     2.3  通知
 * 3 防止虚假唤醒用while
 *
 *
 * */






