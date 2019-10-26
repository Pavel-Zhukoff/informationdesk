package ru.pavel_zhukoff.desk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavel_zhukoff.desk.dao.UserDao;
import ru.pavel_zhukoff.desk.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
