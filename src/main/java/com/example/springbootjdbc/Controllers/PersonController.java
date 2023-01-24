package com.example.springbootjdbc.Controllers;

import com.example.springbootjdbc.service.AuthService;
import com.example.springbootjdbc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    private final AuthService authService;

    @Autowired
    public PersonController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("home")
    public String login(@RequestParam String username, @RequestParam String password, ModelMap model) {
        if (authService.checkIfValidLogin(username,password))
            return "redirect:invoice";
        else{
            model.put("error","incorrect Username or Password");
            return "home";
        }
    }
}
