package ru.pavel_zhukoff.desk.service;

import ru.pavel_zhukoff.desk.entity.Desk;
import ru.pavel_zhukoff.desk.entity.User;

import java.util.List;

public interface DeskService {
    List<Desk> findAll();

    List<Desk> findAllByUser(User user);

    Desk findById(int deskId);

    void deleteById(int deskId);

    void save(Desk desk);

    void update(Desk desk);
}
