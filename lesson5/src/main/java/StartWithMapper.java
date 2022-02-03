import com.learn.mybatis.mapper.UserMapper;
import com.learn.mybatis.model.UserShortCut;
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
        UserMapper userMapper = session.getMapper(UserMapper.class);
        UserShortCut shortCut = userMapper.selectUserShortcutById(1);
        System.out.println(shortCut);
        System.out.println(shortCut.getUsername());
        System.out.println(shortCut.getAge());
        // 关闭会话
        session.close();
    }
}