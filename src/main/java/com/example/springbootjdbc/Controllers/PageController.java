package com.example.springbootjdbc.Controllers;
import com.example.springbootjdbc.model.Invoice;
import com.example.springbootjdbc.service.InvoiceService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    private final InvoiceService invoiceService;
    @Autowired
    public PageController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
    @GetMapping("/")
    public String switchToHomePage(){
        return "redirect:home";
    }
    @GetMapping("home")
    public String switchToHomePageTwo(){
        return "home";
    }
    @GetMapping("invoice")
    public String switchToInvoicePage(HttpSession session, ModelMap model){
        model.addAttribute("invoiceList",
        invoiceService.displayInvoices((String) session.getAttribute("username")));
        return "invoice";
    }
    @GetMapping("payment")
    public String switchToPaymentPage(HttpSession session){
        return "payment";
    }
    @GetMapping("edit/update/id{id}")
    public String switchToEditPage(ModelMap model,@PathVariable("id") int id){
        Invoice invoice = invoiceService.findById(id);
        model.addAttribute("invoice",invoice);
        return "edit";
    }
    @GetMapping("edit/delete*")
    public String switchToDeletePage(){
        return "edit";
    }
}
