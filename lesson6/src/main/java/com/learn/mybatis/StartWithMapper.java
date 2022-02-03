package com.learn.mybatis;

import com.learn.mybatis.mapper6.UserMapper;
import com.learn.mybatis.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

/**
 * @author : Kristen
 * @date : 2022/2/3
 * @description :
 */
public class StartWithMapper {
    public static void main(String[] args) throws IOException, SQLException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("insert test");
        user.setAge(100);
        user.setScore(100000);
        int rows = userMapper.insertUser(user);
        System.out.println(rows);
        // 一定要提交
        session.commit();
        // 关闭会话
        session.close();
    }
}