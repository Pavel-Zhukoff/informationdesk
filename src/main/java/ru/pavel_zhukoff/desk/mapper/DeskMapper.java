package ru.pavel_zhukoff.desk.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import ru.pavel_zhukoff.desk.dao.UserDao;
import ru.pavel_zhukoff.desk.entity.Desk;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeskMapper implements RowMapper<Desk> {

    @Override
    public Desk mapRow(ResultSet resultSet, int i) throws SQLException {
        Desk desk = new Desk();
        desk.setDeskId(resultSet.getInt("desk_id"));
        desk.setTitle(resultSet.getString("title"));
        desk.setText(resultSet.getString("text"));
        desk.setCreationDate(resultSet.getDate("creation_date"));
        desk.setAuthor(resultSet.getInt("user_id"));
        return desk;
    }
}
