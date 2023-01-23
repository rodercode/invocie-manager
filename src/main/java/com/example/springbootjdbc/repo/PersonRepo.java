package com.example.springbootjdbc.repo;

import com.example.springbootjdbc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonRepo {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public PersonRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Person selectPersonByUsername(String username){
        try {
            return jdbcTemplate.queryForObject("SELECT username FROM login WHERE username=?",
                    new BeanPropertyRowMapper<>(Person.class),username);
        }catch (EmptyResultDataAccessException e) {
            return null;
        }
        }
        





}
