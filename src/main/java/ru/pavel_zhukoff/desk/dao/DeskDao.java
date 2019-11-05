package ru.pavel_zhukoff.desk.dao;

import ru.pavel_zhukoff.desk.entity.Desk;
import ru.pavel_zhukoff.desk.entity.User;

import java.util.Date;
import java.util.List;

public interface DeskDao {
    List<Desk> findAll();

    List<Desk> findAllByUser(User user);

    Desk findById(int deskId);

    void deleteById(int deskId);

    void save(Desk desk);

    void update(Desk desk);

    List<Desk> findByDateSince(Date date);

    List<Desk> findByDateTo(Date date);
}
