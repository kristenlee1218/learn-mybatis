package com.learn.mybatis.mapper;

import com.learn.mybatis.model.User;
import com.learn.mybatis.model.UserShortCut;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @author : Kristen
 * @date : 2022/1/30
 * @description :
 */
public interface UserMapper {
    @Results({
            @Result(property = "id", column = "id", id = true),
            @Result(property = "username", column = "username"),
            @Result(property = "age", column = "age"),
            @Result(property = "score", column = "score")
    })
    @Select("SELECT * FROM imooc_user WHERE id = #{id}")
    public User selectUserById(Integer id);

    @Select("SELECT * FROM imooc_user WHERE id = #{id}")
    public UserShortCut selectUserShortcutById(Integer id);
}
