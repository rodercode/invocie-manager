package com.example.springbootjdbc.Controllers;
import com.example.springbootjdbc.model.Invoice;
import com.example.springbootjdbc.service.InvoiceService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class InvoiceController {
    private final InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
    @PostMapping("payment")
    public String createInvoice(HttpSession session, @ModelAttribute Invoice invoice) {
        invoice.setId_coworker((String) session.getAttribute("username"));
        invoiceService.addInvoice(invoice);
        return "redirect:/invoice";
    }
    @PostMapping("edit/delete*")
    public String deleteInvoice(@RequestParam int id){
        invoiceService.deleteInvoice(id);
        return "redirect:/invoice";
    }

    @PostMapping("edit/update/id{id}")
    public String updateInvoice(HttpSession session,@ModelAttribute Invoice invoice,@PathVariable int id){
        invoice.setId_coworker((String) session.getAttribute("username"));
        invoiceService.updateInvoice(invoice,id);
        return "redirect:/invoice";
    }
}