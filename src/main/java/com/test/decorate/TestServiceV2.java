package com.test.decorate;

/**
 * @Author: zhaomengjie
 * @Date: 2020/7/30 23:17
 * @Version 1.0
 */
public interface TestServiceV2 {
    void login(String username, String password);
    void logout(String username);
}
