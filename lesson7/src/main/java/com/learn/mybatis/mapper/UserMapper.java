package com.learn.mybatis.mapper;

import com.learn.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : Kristen
 * @date : 2022/2/3
 * @description :
 */
@Mapper
public interface UserMapper {
    int insertUser(User user);
}
