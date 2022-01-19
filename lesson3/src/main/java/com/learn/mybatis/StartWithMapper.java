package com.learn.mybatis;

import com.learn.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

/**
 * @author : Kristen
 * @date : 2022/1/19
 * @description :
 */
public class StartWithMapper {
    public static void main(String[] args) throws IOException, SQLException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        // 得到 mapper
        UserMapper mapper = session.getMapper(UserMapper.class);
        // 调用注解的SQL
        String username = mapper.selectUsernameById(1);
        System.out.println("username: " + username);
        // 调用XML的SQL
        int age = mapper.selectUserAgeById(1);
        System.out.println("age: " + age);
        // 关闭会话
        session.close();
    }
}