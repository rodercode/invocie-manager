package com.example.springbootjdbc.repo;

import com.example.springbootjdbc.model.Coworker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoworkerRepo {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CoworkerRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Coworker selectPersonByUsername(String username) {
        try {
            return jdbcTemplate.queryForObject("SELECT username FROM coworker WHERE username=?",
                    new BeanPropertyRowMapper<>(Coworker.class), username);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public Coworker selectPersonByPassword(String password){
        try {
            return jdbcTemplate.queryForObject("SELECT password FROM coworker WHERE password=?",
                    new BeanPropertyRowMapper<>(Coworker.class),password);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }


}
