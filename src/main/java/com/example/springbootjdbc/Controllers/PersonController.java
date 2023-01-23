package com.example.springbootjdbc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    @PostMapping("home")
    public String login(@RequestParam String username, @RequestParam String password){
        return "redirect:invoice";
    }

}
