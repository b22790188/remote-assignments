package org.example.assignment3.dao;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserByAccountInfo(UserDto userDto) {
        String sql = "SELECT * FROM user WHERE email = ? AND password = ?";
        try {
            return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new User(
                    rs.getString("email"),
                    rs.getString("password")
            ), userDto.getEmail(), userDto.getPassword());
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public User getUserByEmail(String email) {
        String sql = "SELECT * FROM user WHERE email = ?";
        try {
            return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new User(
                    rs.getString("email")
            ), email);
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }


    @Override
    public void createUser(UserDto userDto) {
        try {
            String sql = "INSERT INTO user (email, password) VALUES (?, ?)";
            jdbcTemplate.update(sql, userDto.getEmail(), userDto.getPassword());
        } catch (DataAccessException dae) {
            System.out.println(dae.getMessage());
        }
    }
}
