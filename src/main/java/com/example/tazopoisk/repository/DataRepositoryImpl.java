package com.example.tazopoisk.repository;

import com.example.tazopoisk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.sql.Types;

@Repository("dataRespitory")
public class DataRepositoryImpl implements DataRepository<User> {

    @Autowired
    protected JdbcOperations jdbcOperations;

    @Override
    public void persist(User object) {

        Object[] params = new Object[] { object.getId(), object.getFirstName(), object.getLastName() };
        int[] types = new int[] { Types.INTEGER, Types.VARCHAR, Types.VARCHAR };

        jdbcOperations.update("INSERT INTO users(\n" +
                "            id, firstName, lastName)\n" +
                "    VALUES (?, ?, ?);", params, types);
    }

    @Override
    public void delete(User object) {
        jdbcOperations.update("DELETE FROM users\n" +
                " WHERE id = " + object.getId() + ";");
    }




}
