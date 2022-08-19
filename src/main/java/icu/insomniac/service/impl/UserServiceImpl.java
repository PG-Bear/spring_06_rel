package icu.insomniac.service.impl;

import icu.insomniac.dao.UserDao;
import icu.insomniac.main.User;
import icu.insomniac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public boolean logIn(String username, String password) {
        User user = userDao.selectByCondition(username, password);
        System.out.println(user);
        return user!=null ? true:false;
    }

    public boolean checkUsername(String username) {
        User user = userDao.selectByUsername(username);
        System.out.println(user);
        return user==null ? true:false;
    }
}
