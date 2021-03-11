package com.shijieq.service;

import com.shijieq.po.Blog;
import com.shijieq.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author ShijieQ, on  2021/2/22 15:09
 */
public interface BlogService {

    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable, Long tagId);

    Page<Blog> listBlog(Pageable pageable, String query);

    List<Blog> listRecommendBlogTop(Integer size);

    Map<String, List<Blog>> archiveBlog();

    Blog saveBlog(Blog blog);

    Long countBlog();

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);
}
