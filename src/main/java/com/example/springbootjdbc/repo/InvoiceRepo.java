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
        jdbcTemplate.update("INSERT INTO invoice(title, created_at, description, category, price)VALUES (?,now(),?,?,?)",
                invoice.getTitle(), invoice.getDescription(),
                invoice.getCategory(), invoice.getPrice());
    }
}
