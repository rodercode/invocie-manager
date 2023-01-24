package com.example.springbootjdbc.model;

import java.util.List;

public class InvoiceList {

    private List<Invoice> invoices;
    private String owner;

    public InvoiceList() {
    }

    public InvoiceList(List<Invoice> invoices, String owner) {
        this.invoices = invoices;
        this.owner = owner;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "InvoiceList{" +
                "invoices=" + invoices +
                ", owner='" + owner + '\'' +
                '}';
    }
}
