package com.learn.mybatis.mapper;

import com.learn.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author : Kristen
 * @date : 2022/1/30
 * @description :
 */
@Mapper
public interface UserMapper {
    @Select("SELECT username FROM imooc_user WHERE id = #{id}")
    String selectUsernameById(Integer id);

    @Select("SELECT * FROM imooc_user WHERE age = #{age} AND score = #{score}")
    User selectUserByAgeAndScore(User user);
}
