package com.shijieq.dao;

import com.shijieq.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ShijieQ, on  2021/2/22 13:39
 */
public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findByName(String name);
}
