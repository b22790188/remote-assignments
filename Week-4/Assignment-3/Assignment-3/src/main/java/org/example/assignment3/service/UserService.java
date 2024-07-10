package org.example.assignment3.service;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.RegistrationResult;
import org.example.assignment3.model.User;

public interface UserService {

   /**
    * @param  userDto - User sign up info provided by client.
    * @return - RegistrationResult, containing signupMessage and corresponding templateName
    */
   RegistrationResult signup(UserDto userDto);
   void createUser(UserDto userDto);
}
