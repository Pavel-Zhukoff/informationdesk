package ru.pavel_zhukoff.desk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pavel_zhukoff.desk.dao.DeskDao;
import ru.pavel_zhukoff.desk.entity.Desk;
import ru.pavel_zhukoff.desk.entity.User;

import java.util.Date;
import java.util.List;

@Service
public class DeskServiceImpl implements DeskService {

    @Autowired
    private DeskDao deskDao;

    @Override
    public List<Desk> findAll() {
        return deskDao.findAll();
    }

    @Override
    public List<Desk> findAllByUser(User user) {
        return deskDao.findAllByUser(user);
    }

    @Override
    public Desk findById(int deskId) {
        return deskDao.findById(deskId);
    }

    @Override
    public void deleteById(int deskId) {
        deskDao.deleteById(deskId);
    }

    @Override
    public void save(Desk desk) {
        deskDao.save(desk);
    }

    @Override
    public void update(Desk desk) {
        deskDao.update(desk);
    }

    @Override
    public List<Desk> findByDateSince(Date date) {
        return deskDao.findByDateSince(date);
    }

    @Override
    public List<Desk> findByDateTo(Date date) {
        return deskDao.findByDateTo(date);
    }
}
