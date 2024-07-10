package org.example.assignment3.dao;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.User;

public interface UserDao {
    /**
     *
     * @param email - email provided by client.
     * @return User - if user can be found in database, return user.Otherwise, return null.
     */
    User getUserByEmail(String email);

    /**
     * @param userDto User info provided by client.
     * @return - Message that shows if signup is successful or not.
     */
    String createUser(UserDto userDto);
}
