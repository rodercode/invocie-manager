package com.example.springbootjdbc.repo;

import com.example.springbootjdbc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepo {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Person selectPersonByUsername(String username) {
        try {
            return jdbcTemplate.queryForObject("SELECT username FROM coworker WHERE username=?",
                    new BeanPropertyRowMapper<>(Person.class), username);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public Person selectPersonByPassword(String password){
        try {
            return jdbcTemplate.queryForObject("SELECT password FROM coworker WHERE password=?",
                    new BeanPropertyRowMapper<>(Person.class),password);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }


}
