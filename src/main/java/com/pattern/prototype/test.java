package com.pattern.prototype;

import java.util.ArrayList;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/10 16:45
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        //这样的使用是一个浅克隆，因为如果己创建后输出的对象是相同的，所以是浅克隆,集合之类的是创建新的了，对象还是原来的
        Prototype prototype = new Prototype();
        prototype.setList(new ArrayList(){{add("1");}});
        prototype.setClonePerson(new ClonePerson());
        System.out.println(prototype);
        System.out.println("源对象:"+prototype.getList().hashCode());
        System.out.println("源对象:"+prototype.getClonePerson());
        try {
            Prototype prototype1 = (Prototype)prototype.clone();
            System.out.println(prototype1);
            System.out.println("克隆后对象:"+prototype1.getList().hashCode());
            System.out.println("克隆后对象:"+prototype1.getClonePerson());

            //深复制
            Prototype prototype2 = (Prototype)prototype.deepClone();
            System.out.println("深复制后对象:"+prototype2.getClonePerson());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
