package com.example.springbootjdbc.service;

import com.example.springbootjdbc.repo.InvoiceListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceListService {

    private final InvoiceListRepo invoiceListRepo;
    @Autowired
    public InvoiceListService(InvoiceListRepo invoiceListRepo) {
        this.invoiceListRepo = invoiceListRepo;
    }
}
