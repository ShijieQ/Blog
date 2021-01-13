package com.shijieq.dao;

import com.shijieq.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ShijieQ, on  2021/1/13 21:30
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
