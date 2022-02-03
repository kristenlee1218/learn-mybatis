package com.learn.mybatis.mapper8;

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
    @Update("UPDATE imooc_user SET age = #{age} WHERE id = #{id}")
    int updateUserAgeById(@Param("age") Integer age, @Param("id") Integer id);
}
