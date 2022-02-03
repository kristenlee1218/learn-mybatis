package com.learn.mybatis.mapper6;

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

//    @Insert("INSERT INTO imooc_user(username,age,score) VALUES (#{username},#{age},#{score})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
//    int insertUser(User user);

}
