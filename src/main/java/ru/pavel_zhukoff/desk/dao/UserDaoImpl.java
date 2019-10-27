package ru.pavel_zhukoff.desk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.pavel_zhukoff.desk.entity.User;
import ru.pavel_zhukoff.desk.mapper.UserMapper;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public User findById(int userId) {
        String sql = "SELECT * FROM user WHERE user_id = ?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), userId);
    }

    @Override
    public void deleteById(int userId) {
        String sql = "DELETE FROM user FROM user_id = ?";
        jdbcTemplate.update(sql, userId);
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO user (username, email, password, register_date)" +
                " VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getDate());
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET username = ?, email = ?, password = ?, register_date = ?";
        jdbcTemplate.update(sql,
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getDate());
    }
}
