package com.example.springbootjdbc.model;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;

public class Invoice {

    private int id;
    private String id_coworker;
    private String title;
    private String description;
    private String category;
    private int price;
    private LocalDate createdAt;
    private Button delete;
    public Invoice() {
    }

    public Invoice(String id_coworker, String theTitle, String description, String category, int price) {
        this.id_coworker = id_coworker;
        this.title = theTitle;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId_coworker() {
        return id_coworker;
    }

    public void setId_coworker(String id_coworker) {
        this.id_coworker = id_coworker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return
                " title: " + title +
                " description: " + description +
                " category: " + category +
                " price: " + price;
    }
}
