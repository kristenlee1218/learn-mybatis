package com.learn.mybatis8.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : Kristen
 * @date : 2022/2/3
 * @description :
 */

@Mapper
public interface UserMapper {
    int updateUserAgeById(@Param("age") Integer age, @Param("id") Integer id);
}
