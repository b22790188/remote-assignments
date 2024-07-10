package org.example.assignment3.service;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.dao.UserDao;
import org.example.assignment3.model.RegistrationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public RegistrationResult signup(UserDto userDto) {

        boolean isRegistered = (userDao.getUserByEmail(userDto.getEmail()) != null);

        return isRegistered ? new RegistrationResult("You have registered before!", "signup") : new RegistrationResult("Thanks for join us!", "member");
    }

    @Override
    public void createUser(UserDto userDto) {
        userDao.createUser(userDto);
    }
}
