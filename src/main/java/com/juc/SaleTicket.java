package com.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ticket //实例例eld +method
{
    private int number = 30;
/* //1同步 public synchronized void sale()
 {//2同步  synchronized(this) {}
  if(number > 0) {
    System.out.println(Thread.currentThread().getName()+"卖出"+(number--)+"\t 还剩number);
   }
 }*/

    // Lock implementations provide more extensive locking operations
// than can be obtained using synchronized methods and statements.
    private Lock lock = new ReentrantLock();//List list = new ArrayList()

    public void sale() {
        lock.lock();

        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出" + (number--) + "\t 还剩"+number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}


/**
 * @author xiale
 * 笔记：J里面如何 1 多线程编-上
 * 1.1 线程  (资里源类 *   1.2 高内聚 /
 * @Description:卖票程序个售票出 0张票
 **/
public class SaleTicket {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        //Thread(Runnable target, String name) Allocates a new Thread object.<p><p><p>
        new Thread(() -> {
            for (int i = 1; i < 40; i++) {
                ticket.sale();
            }
        }, "AA").start();
        new Thread(() -> {
            for (int i = 1; i < 40; i++) {
                ticket.sale();
            }
        }, "BB").start();
        new Thread(() -> {
            for (int i = 1; i < 40; i++) {
                ticket.sale();
            }
        }, "CC").start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 40; i++) {
//
//                    ticket.sale();
//                }
//            }
//        }, "AA").start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 40; i++) {
//                    ticket.sale();
//                }
//            }
//        }, "BB").start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 40; i++) {
//                    ticket.sale();
//                }
//            }
//        }, "CC").start();

    }
}


//1 class MyThread implements Runnable

//2 匿名内部类

//3 laExpress





