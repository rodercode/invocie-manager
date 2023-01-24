package com.example.springbootjdbc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceListRepo {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public InvoiceListRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }




}
