package com.pattern.factory.simple;

import com.pattern.factory.MengniuMilk;
import com.pattern.factory.Milk;
import com.pattern.factory.SanLuMilk;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 16:44
 * @Version 1.0
 * @Deprecated 简单工程模式
 */
public class SimpleFactory {

    public Milk getMile(String name){
        if(("三鹿").equalsIgnoreCase(name)){
            return new SanLuMilk();
        }else{
            return new MengniuMilk();
        }
    }
}
