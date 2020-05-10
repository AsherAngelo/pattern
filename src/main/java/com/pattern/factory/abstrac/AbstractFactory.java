package com.pattern.factory.abstrac;

import com.pattern.factory.Milk;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 20:51
 * @Version 1.0
 * @Deprecated 抽象工厂模式,抽象工厂是用户主入口
 */
public abstract class AbstractFactory {

    //公共逻辑
    //方便统一管理

    /**
     * 获得一个蒙牛品牌的牛奶
     * @return
     */
    public abstract Milk getMengniu();
    /**
     * 获得一个三鹿品牌的牛奶
     * @return
     */
    public abstract Milk getSanlu();
}
