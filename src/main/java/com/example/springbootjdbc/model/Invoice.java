package com.example.springbootjdbc.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    private String id_coworker;
    private String title;
    private String description;
    private String category;
    private int price;
    public Invoice() {
    }

    public Invoice(String id_coworker, String title, String description, String category, int price) {
        this.id_coworker = id_coworker;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
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

    @Override
    public String toString() {
        return "Invoice{" +
                "id_coworker='" + id_coworker + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
