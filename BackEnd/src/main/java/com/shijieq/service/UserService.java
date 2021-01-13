package com.shijieq.service;

import com.shijieq.po.User;

/**
 * @author ShijieQ, on  2021/1/13 21:28
 */
public interface UserService {
    User checkUser(String username, String password);
}
