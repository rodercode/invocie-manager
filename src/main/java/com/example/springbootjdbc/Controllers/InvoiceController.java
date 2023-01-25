package com.example.springbootjdbc.Controllers;

import com.example.springbootjdbc.model.Invoice;
import com.example.springbootjdbc.service.InvoiceService;
import com.example.springbootjdbc.service.UserSessionService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InvoiceController {
    private final InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("payment")
    public String createInvoice(HttpSession session,@RequestParam String title, @RequestParam String description,
                                @RequestParam String category, @RequestParam int price) {
        invoiceService.addInvoice(new Invoice((String) session.getAttribute("username"),title, description, category,price));
        return "payment";
    }
}
