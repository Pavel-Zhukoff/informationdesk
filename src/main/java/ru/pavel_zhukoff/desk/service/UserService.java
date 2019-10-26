package ru.pavel_zhukoff.desk.service;

import ru.pavel_zhukoff.desk.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
