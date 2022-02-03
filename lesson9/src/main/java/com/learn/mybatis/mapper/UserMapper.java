package com.learn.mybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author : Kristen
 * @date : 2022/2/3
 * @description :
 */
@Mapper
public interface UserMapper {
    @Delete("DELETE FROM imooc_user WHERE id = #{id}")
    int deleteUserById(Integer id);
}
