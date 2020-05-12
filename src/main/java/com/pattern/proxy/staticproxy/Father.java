package com.pattern.proxy.staticproxy;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/11 21:17
 * @Version 1.0
 */

/**
 * 这就是一个静态代理
 */
public class Father {

    private Person person;

    //没办法扩展
    public Father(Person person){
        this.person = person;
    }

    //拿到目标对象的引用
    public void findLove(){
        System.out.println("根据要求替你物色");
        this.person.findLove();
        System.out.println("双方服务是否同意");
    }
}
