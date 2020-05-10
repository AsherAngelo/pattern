package com.pattern.factory.abstrac;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/8 20:53
 * @Version 1.0
 * @Deprecated 解决用户和产品的问题
 */

/**
 * 再spring中最广泛的模式
 * 易于扩展
 */
public class test {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();
        //对于用户来说更加简单，
        //用户只有选择的权力，保证程序健壮性，符合开闭原则,对扩展开放修改关闭
        System.out.println(milkFactory.getMengniu());
    }
}
