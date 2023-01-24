package com.example.springbootjdbc.repo;

import com.example.springbootjdbc.model.Invoice;
import com.example.springbootjdbc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceListRepo {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public InvoiceListRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Invoice invoice) {
        jdbcTemplate.update("" +
                        "INSERT INTO invoice(title, invoice_time, description, category, price) " +
                        "VALUES (?,?,?,?,?)",
                        invoice.getTitle(), invoice.getInvoiceTime(),invoice.getDescription(),
                        invoice.getCategory(),invoice.getPrice());
    }
}
