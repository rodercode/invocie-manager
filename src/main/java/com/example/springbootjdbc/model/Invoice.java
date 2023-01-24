package com.example.springbootjdbc.model;

import java.text.DateFormat;

public class Invoice {
    private String title;
    private DateFormat invoiceTime;
    private String description;
    private String category;
    private Double price;

    public Invoice() {
    }

    public Invoice(String title, DateFormat invoiceTime, String description, String category, Double price) {
        this.title = title;
        this.invoiceTime = invoiceTime;
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

    public DateFormat getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(DateFormat invoiceTime) {
        this.invoiceTime = invoiceTime;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", invoiceTime=" + invoiceTime +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
