package com.pattern.proxy.staticproxy;

import com.pattern.proxy.staticproxy.Father;
import com.pattern.proxy.staticproxy.Person;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/11 21:19
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        //只能帮儿子找对象，不能帮别人
        Father father = new Father(new Person());
        father.findLove();
    }
}
