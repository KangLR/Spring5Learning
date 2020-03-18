package com.kang.service;

import com.kang.dao.UserDao;
import com.kang.dao.UserDaoImpl;

/**
 * @author klr
 * @create 2020-03-18-10:40
 */
public class UserServiceImpl implements UserService {
    //业务层调Dao层，组合的概念
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
