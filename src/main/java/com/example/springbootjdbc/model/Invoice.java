package com.example.springbootjdbc.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    private String title;

    private Date created_at;
    private String description;
    private String category;
    private int price;

    public Invoice() {
    }

    public Invoice(String title, String description, String category, int price) {
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
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
                "title='" + title + '\'' +
                ", created_at=" + created_at +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
