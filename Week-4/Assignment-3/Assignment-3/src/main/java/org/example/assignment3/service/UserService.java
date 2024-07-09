package org.example.assignment3.service;

import org.example.assignment3.model.User;

public interface UserService {
   User getUserByEmail(String email, String password);
   void createUser(User user);
}
