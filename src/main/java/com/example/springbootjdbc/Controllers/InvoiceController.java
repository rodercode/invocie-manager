package com.example.springbootjdbc.Controllers;

import com.example.springbootjdbc.model.Invoice;
import com.example.springbootjdbc.model.Person;
import com.example.springbootjdbc.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;

@Controller
public class InvoiceController {
    private final InvoiceService invoiceService;
    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("payment")
    public String createInvoice(@RequestParam String title, @RequestParam String description,
                                @RequestParam String category, @RequestParam double price) {

        new Invoice(title, new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"), description,
                category, price);
        personService.registerPerson(new Person(username,password));

    }
}