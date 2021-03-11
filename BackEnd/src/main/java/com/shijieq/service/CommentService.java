package com.shijieq.service;

import com.shijieq.po.Comment;

import java.util.List;

/**
 * @author ShijieQ, on  2021/3/10 14:21
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
