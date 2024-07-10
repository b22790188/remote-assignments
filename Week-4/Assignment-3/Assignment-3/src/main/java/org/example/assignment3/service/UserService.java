package org.example.assignment3.service;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.User;

public interface UserService {

   /**
    * @param user - User sign up info provided by client.
    * @return - Message that shows if signup is successful or not.
    */
   String signup(UserDto userDto);
   void createUser(UserDto userDto);
}
