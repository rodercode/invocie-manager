package com.example.springbootjdbc.Controllers;

import com.example.springbootjdbc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    private final PersonService personService;
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("home")
    public String login(@RequestParam String username, @RequestParam String password){
        return "redirect:invoice";
    }

}
