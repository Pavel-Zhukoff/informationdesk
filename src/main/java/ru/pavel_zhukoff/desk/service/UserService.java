package ru.pavel_zhukoff.desk.service;

import ru.pavel_zhukoff.desk.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int userId);

    void deleteById(int userId);

    void save(User user);

    void update(User user);
}
