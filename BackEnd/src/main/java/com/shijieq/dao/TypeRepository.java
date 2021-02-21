package com.shijieq.dao;

import com.shijieq.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ShijieQ, on  2021/1/19 21:18
 */
public interface TypeRepository extends JpaRepository<Type, Long> {

    Type findByName(String name);
}
