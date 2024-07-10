package org.example.assignment3.service;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.dao.UserDao;
import org.example.assignment3.model.AuthResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public AuthResult signup(UserDto userDto) {
        return Optional.ofNullable(userDao.getUserByAccountInfo(userDto))
                .map(user -> new AuthResult("You have registered before! Please sign in instead of sign up!", ""))
                .orElseGet(() -> {
                    userDao.createUser(userDto);
                    return new AuthResult("Thanks for join us!", "member");
                });
    }

    @Override
    public AuthResult login(UserDto userDto) {
        return Optional.ofNullable(userDao.getUserByAccountInfo(userDto))
                .map(user -> new AuthResult("Welcome back!", "member"))
                .orElseGet(() -> new AuthResult("Login failed! Please try again!", ""));

    }
}
