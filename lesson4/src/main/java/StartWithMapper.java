import com.learn.mybatis.mapper.UserMapper;
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
 * @date : 2022/1/30
 * @description :
 */
public class StartWithMapper {
    public static void main(String[] args) throws IOException, SQLException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        // 得到 mapper
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User condition = new User();
        condition.setAge(18);
        condition.setScore(100);
        // 调用方法
        User user = userMapper.selectUserByAgeAndScore(condition);
        // 得到 user
        System.out.println(user);
        System.out.println(user);
        System.out.println(user.getUsername());
        System.out.println(user.getAge());
        System.out.println(user.getId());
        System.out.println(user.getScore());
        // 关闭会话
        session.close();
    }
}