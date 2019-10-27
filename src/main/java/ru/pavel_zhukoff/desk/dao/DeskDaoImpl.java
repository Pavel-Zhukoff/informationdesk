package ru.pavel_zhukoff.desk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.pavel_zhukoff.desk.entity.Desk;
import ru.pavel_zhukoff.desk.entity.User;
import ru.pavel_zhukoff.desk.mapper.DeskMapper;

import java.util.List;

public class DeskDaoImpl implements DeskDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DeskDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Desk> findAll() {
        String sql = "SELECT * FROM desk";
        return jdbcTemplate.query(sql, new DeskMapper());
    }

    @Override
    public List<Desk> findAllByUser(User user) {
        String sql = "SELECT * FROM desk " +
                "WHERE user_id = ?";
        return jdbcTemplate.query(sql, new DeskMapper(), user.getUserId());
    }

    @Override
    public Desk findById(int deskId) {
        String sql = "SELECT * FROM desk " +
                "WHERE desk_id = ?";
        return jdbcTemplate.queryForObject(sql, new DeskMapper(), deskId);
    }

    @Override
    public void deleteById(int deskId) {
        String sql = "DELETE FROM desk " +
                "WHERE desk_id = ?";
        jdbcTemplate.update(sql, deskId);
    }

    @Override
    public void save(Desk desk) {
        String sql = "INSERT INTO desk (title, text, user_id) " +
                "VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,
                desk.getTitle(),
                desk.getText(),
                desk.getAuthor());
    }

    @Override
    public void update(Desk desk) {
        String sql = "UPDATE desk SET title = ?, text = ? " +
                "WHERE desk_id = ?";
        jdbcTemplate.update(sql,
                desk.getTitle(),
                desk.getText(),
                desk.getDeskId());
    }
}
