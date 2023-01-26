package com.example.springbootjdbc.Controllers;

import ch.qos.logback.core.model.Model;
import com.example.springbootjdbc.model.Invoice;
import jakarta.servlet.http.HttpSession;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @GetMapping("payment")
    public String switchToPaymentPage(HttpSession session){
        System.out.println(session.getAttribute("username"));
        return "payment";
    }
}
