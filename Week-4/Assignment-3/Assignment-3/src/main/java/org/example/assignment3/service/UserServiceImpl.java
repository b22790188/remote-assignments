package org.example.assignment3.service;

import org.example.assignment3.dao.UserDao;
import org.example.assignment3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByEmail(String email, String password){
        return userDao.getUserByEmail(email, password);
    }

    @Override
    public void createUser(User user){
        userDao.createUser(user);
    }
}
