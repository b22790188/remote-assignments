package org.example.assignment3.service;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.dao.UserDao;
import org.example.assignment3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public String signup(UserDto userDto){
        boolean isRegistered = (userDao.getUserByEmail(userDto.getEmail()) != null);
        return isRegistered ? "You have registered before!" : userDao.createUser(userDto);
    }

    @Override
    public void createUser(UserDto userDto){
        userDao.createUser(userDto);
    }
}
