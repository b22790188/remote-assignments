package org.example.assignment3.dao;

import org.example.assignment3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserByEmail(String email, String password) {
        try {
            String query = "SELECT * FROM user WHERE email = ? AND password = ?";
            return jdbcTemplate.queryForObject(query, (rs, rowNum) -> new User(
                    rs.getInt("id"),
                    rs.getString("password"),
                    rs.getString("email")
            ), email, password);

        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public void createUser(User user) {

    }
}
