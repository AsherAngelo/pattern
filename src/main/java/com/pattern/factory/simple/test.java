package com.pattern.factory.simple;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 16:52
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        //用户不在关心生产过程，只需要知道想要啥养的结果就行，下面返回的是不同的对象
        //隐藏了创建过程，只说需求
        System.out.println(simpleFactory.getMile("三鹿"));

    }
}
