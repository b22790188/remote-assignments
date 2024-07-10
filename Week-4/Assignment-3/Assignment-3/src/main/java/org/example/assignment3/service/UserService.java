package org.example.assignment3.service;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.AuthResult;

public interface UserService {

   /**
    * @param  userDto - User sign up info provided by client.
    * @return - RegistrationResult, containing signupMessage and corresponding templateName
    */
   AuthResult signup(UserDto userDto);

   AuthResult login(UserDto userDto);
}
