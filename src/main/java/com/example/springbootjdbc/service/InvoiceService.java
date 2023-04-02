package com.example.springbootjdbc.service;

import com.example.springbootjdbc.model.Coworker;
import com.example.springbootjdbc.model.Invoice;
import com.example.springbootjdbc.repo.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepo invoiceRepo;
    @Autowired
    public InvoiceService(InvoiceRepo invoiceRepo) {
        this.invoiceRepo = invoiceRepo;
    }

    public void addInvoice(Invoice invoice){
        invoiceRepo.insert(invoice);
    }

    public List<Invoice> displayInvoices(String username){
        return invoiceRepo.findAll(username);
    }

    public void deleteInvoice(int id){
        invoiceRepo.deleteInvoice(id);
    }

    public Invoice findById(int id){
        return invoiceRepo.selectById(id);
    }

    public void updateInvoice(Invoice invoice, int id){
        invoiceRepo.update(invoice,id);
    }
}
