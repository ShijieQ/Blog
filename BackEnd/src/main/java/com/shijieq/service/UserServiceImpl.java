package com.shijieq.service;

import com.shijieq.dao.UserRepository;
import com.shijieq.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ShijieQ, on  2021/1/13 21:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user;
    }
}
