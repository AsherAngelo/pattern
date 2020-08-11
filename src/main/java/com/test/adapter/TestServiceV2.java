package com.test.adapter;

/**
 * @Author: zhaomengjie
 * @Date: 2020/7/30 23:13
 * @Version 1.0
 */
public class TestServiceV2 extends TestService{

    public void forQQ(String token){
        super.register(token,null);
        super.login(token,null);
    }
}
