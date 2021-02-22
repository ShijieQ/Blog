package com.shijieq.service;

import com.shijieq.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author ShijieQ, on  2021/2/22 13:33
 */
public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getByName(String name);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTage(Long id, Tag tag);

    void deleteTag(Long id);
}
