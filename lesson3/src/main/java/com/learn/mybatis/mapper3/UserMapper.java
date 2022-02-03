package com.learn.mybatis.mapper3;

import org.apache.ibatis.annotations.Select;

/**
 * @author : Kristen
 * @date : 2022/1/19
 * @description :
 */
public interface UserMapper {
    @Select("SELECT username FROM imooc_user WHERE id = #{id}")
    String selectUsernameById(Integer id);

    @Select("SELECT age FROM imooc_user WHERE id = #{id}")
    int selectUserAgeById(Integer id);
}