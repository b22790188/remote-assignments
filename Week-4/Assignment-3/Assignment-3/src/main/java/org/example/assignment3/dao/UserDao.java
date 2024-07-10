package org.example.assignment3.dao;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.User;

public interface UserDao {
    /**
     * @param userDto@return User - if user can be found in database, return user.Otherwise, return null.
     */
    User getUserByAccountInfo(UserDto userDto);

    /**
     * @param userDto User info provided by client.
     * @return - Message that shows if signup is successful or not.
     */
    void createUser(UserDto userDto);
}
