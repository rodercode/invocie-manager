package com.example.springbootjdbc.service;

import com.example.springbootjdbc.model.Invoice;
import com.example.springbootjdbc.repo.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    private final InvoiceRepo invoiceListRepo;
    @Autowired
    public InvoiceService(InvoiceRepo invoiceListRepo) {
        this.invoiceListRepo = invoiceListRepo;
    }

    public void addInvoice(Invoice invoice){

    }
}
