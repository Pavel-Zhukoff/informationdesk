package ru.pavel_zhukoff.desk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavel_zhukoff.desk.dao.UserDao;
import ru.pavel_zhukoff.desk.entity.User;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(int userId) {
        return userDao.findById(userId);
    }

    @Override
    public void deleteById(int userId) {
        userDao.deleteById(userId);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
