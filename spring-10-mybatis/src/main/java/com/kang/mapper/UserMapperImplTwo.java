package com.kang.mapper;

import com.kang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author klr
 * @create 2020-03-19-21:26
 */
public class UserMapperImplTwo extends SqlSessionDaoSupport implements UserMapper{


    //连注入的过程都省略了
    @Override
    public List<User> selectUser() {
        SqlSession sqlSession=getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
