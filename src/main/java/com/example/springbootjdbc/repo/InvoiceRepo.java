package com.example.springbootjdbc.repo;

import com.example.springbootjdbc.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
