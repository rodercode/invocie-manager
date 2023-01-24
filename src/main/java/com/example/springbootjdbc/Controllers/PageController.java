package com.example.springbootjdbc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PageController {

    @GetMapping("/")
    public String switchToHomePage(){
        return "redirect:home";
    }
    @GetMapping("home")
    public String switchToHomePageTwo(){
        return "home";
    }

    @GetMapping("edit")
    public String switchToEditPage(){
        return "edit";
    }

    @GetMapping("invoice")
    public String switchToInvoicePage(){
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date date = new Date();
//        System.out.println(formatter.format(date));
        return "invoice";
    }

    @GetMapping("payment")
    public String switchToPaymentPage(){
        return "payment";
    }
}
