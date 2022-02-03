package com.learn.mybatis.mapper;

import com.learn.mybatis.model.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author : Kristen
 * @date : 2022/2/3
 * @description :
 */

public interface UserMapper {
    @Insert("INSERT INTO imooc_user(username,age,score) VALUES (#{username},#{age},#{score})")
    int insertUser(User user);
}
