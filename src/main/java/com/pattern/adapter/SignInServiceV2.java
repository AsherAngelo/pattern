package com.pattern.adapter;

/**
 * @Author: zhaomengjie
 * @Date: 2020/5/14 23:44
 * @Version 1.0
 */

/**
 * 这里就是适配器模式了
 */
public class SignInServiceV2 extends SignInService{

    public ResultMsg loginForQQ(String openid){
        ResultMsg msg = super.regist(openid,null);
        ResultMsg msg2 = super.login(openid,null);
        return msg2;
    }
}
