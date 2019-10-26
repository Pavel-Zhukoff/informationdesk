package ru.pavel_zhukoff.desk.dao;

import ru.pavel_zhukoff.desk.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
}
