package com.gentleman.mini.blog.model.mapper;

import com.gentleman.mini.blog.model.entity.BlogImage;
import com.gentleman.mini.blog.model.entity.BlogImageDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BlogImage record);

    int insertSelective(BlogImage record);

    BlogImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlogImage record);

    int updateByPrimaryKey(BlogImage record);

    List<String> selectByBlogId(@Param("blogId") Integer blogId, @Param("accessRootUrl") String accessRootUrl);

    int updateBlogById(@Param("blogId") Integer blogId, @Param("id") String id);

    int updateBlogByIds(@Param("blogId") Integer blogId, @Param("ids") String ids);

    List<BlogImageDto> selectDeletedImage(@Param("rootUrl") String rootUrl);

    int delBlogImages(@Param("ids") String ids);

    List<BlogImageDto> selectDeletedImageJob(@Param("rootUrl") String rootUrl, @Param("params") String params,
                                             @Param("total") Integer total, @Param("item") Integer item);
}