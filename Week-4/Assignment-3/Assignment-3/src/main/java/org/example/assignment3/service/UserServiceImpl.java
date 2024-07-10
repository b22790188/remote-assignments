package org.example.assignment3.service;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.dao.UserDao;
import org.example.assignment3.model.AuthResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public AuthResult signup(UserDto userDto) {
        boolean isRegistered = (userDao.getUserByAccountInfo(userDto) != null);
        return isRegistered ? new AuthResult("You have registered before! Please sign in instead of sign up!", "")
                : new AuthResult("Thanks for join us!", "member");
    }

    @Override
    public AuthResult login(UserDto userDto) {
        boolean isMember = (userDao.getUserByAccountInfo(userDto) != null);
        return isMember ? new AuthResult("Welcome back!", "member")
                : new AuthResult("Invalid username or password! Please try again!", "");
    }
}
