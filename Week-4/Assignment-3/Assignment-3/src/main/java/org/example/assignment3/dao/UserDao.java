package org.example.assignment3.dao;

import org.example.assignment3.model.User;

public interface UserDao {
    User getUserByEmail(String email, String password);
    void createUser(User user);
}
