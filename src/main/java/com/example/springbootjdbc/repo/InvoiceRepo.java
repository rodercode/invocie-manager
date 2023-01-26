package com.example.springbootjdbc.repo;

import com.example.springbootjdbc.model.Coworker;
import com.example.springbootjdbc.model.Invoice;
import jakarta.servlet.http.HttpSession;
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

    public List<Invoice> findAll(String username) {
        return jdbcTemplate.query("SELECT id, title, description, category, price, created_at FROM invoice WHERE id_coworker = ?", new BeanPropertyRowMapper<>(Invoice.class), username);
    }

    public void deleteInvoice(int id){
        jdbcTemplate.update("DELETE FROM invoice WHERE id = ?", id);
    }

    public Invoice selectById(int id){
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM invoice WHERE id=?",
                    new BeanPropertyRowMapper<>(Invoice.class),id);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }


//
}
