package org.example.assignment3.dao;

import org.example.assignment3.DTO.UserDto;
import org.example.assignment3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserByEmail(String email) {
        try {
            String sql = "SELECT * FROM user WHERE email = ?";
            return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new User(
                    //Todo: refactor
                    rs.getString("email"),
                    rs.getString("password")
            ), email);

        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public String createUser(UserDto userDto) {
        try {
            String sql = "INSERT INTO user (email, password) VALUES (?, ?)";
            jdbcTemplate.update(sql, userDto.getEmail(), userDto.getPassword());

            return "Create user successfully!";

        } catch (DataAccessException e) {
            //Todo: try to using logger after complete feature of assignment
            System.out.println(e.getMessage());
            return "Create user failed! Please try again!";
        }
    }
}
