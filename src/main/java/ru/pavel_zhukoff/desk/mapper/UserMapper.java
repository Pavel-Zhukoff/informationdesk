package ru.pavel_zhukoff.desk.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.pavel_zhukoff.desk.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {



    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getInt("user_id"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        user.setEmail(resultSet.getString("email"));
        user.setDate(resultSet.getDate("register_date"));
        return user;
    }
}
