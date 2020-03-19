package com.kang.mapper;

import com.kang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author klr
 * @create 2020-03-19-20:45
 */
public class UserMapperImpl implements UserMapper {

    //在原来，我们的所有操作都使用sqlSession来执行
    //现在，都是以sqlSessionTemplate

    private SqlSessionTemplate sqlSession;

    //DI通过set注入，因此必须要有set方法
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }
}
