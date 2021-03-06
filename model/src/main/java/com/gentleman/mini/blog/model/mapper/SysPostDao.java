package com.gentleman.mini.blog.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gentleman.mini.blog.model.entity.SysPostEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//岗位管理
@Mapper
public interface SysPostDao extends BaseMapper<SysPostEntity> {

    int deleteBatch(@Param("ids") String ids);

}
