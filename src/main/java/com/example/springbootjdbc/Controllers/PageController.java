package com.example.springbootjdbc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String switchToHomePage(){
        return "home";
    }
    @GetMapping("edit-page")
    public String switchToEditPage(){
        return "edit-page";
    }

    @GetMapping("invoice-page")
    public String switchToInvoicePage(){
        return "invoice-page";
    }

    @GetMapping("payment-page")
    public String switchToPaymentPage(){
        return "payment-page";
    }



}
