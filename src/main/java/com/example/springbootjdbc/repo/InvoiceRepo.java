package com.example.springbootjdbc.repo;

import com.example.springbootjdbc.model.Coworker;
import com.example.springbootjdbc.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepo {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public InvoiceRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void insert(Invoice invoice) {
        jdbcTemplate.update("INSERT INTO invoice(id_coworker, title, description, category, price, created_at) VALUES(?,?,?,?,?,now())",
                invoice.getId_coworker(), invoice.getTitle(), invoice.getDescription(), invoice.getCategory(), invoice.getPrice());
    }

        public List<Invoice> findAll () {
            return jdbcTemplate.query("SELECT * FROM invoice", new BeanPropertyRowMapper<>(Invoice.class));
        }
        public Coworker selectPersonByPassword (String password){
            try {
                return jdbcTemplate.queryForObject("SELECT password FROM coworker WHERE password=?",
                        new BeanPropertyRowMapper<>(Coworker.class), password);
            } catch (EmptyResultDataAccessException e) {
                return null;
            }
        }
    }
