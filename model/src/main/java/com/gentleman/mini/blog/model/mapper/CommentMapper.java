package com.gentleman.mini.blog.model.mapper;

import com.gentleman.mini.blog.model.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> selectByBlogId(@Param("blogId") Integer blogId);

    int countByBlogId(@Param("blogId") Integer blogId);
}