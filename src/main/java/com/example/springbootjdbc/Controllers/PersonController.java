package com.example.springbootjdbc.Controllers;

import com.example.springbootjdbc.service.AuthService;
import com.example.springbootjdbc.service.PersonService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class PersonController {

    private final AuthService authService;


//    @PostMapping("logout")
//    public String logout(HttpSession session) throws IOException {
//        session.invalidate(); //Invalidate - empty the session
//        return "redirect:/index.html";
//    }

    @Autowired
    public PersonController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("home")
    public String login(HttpSession session, @RequestParam String username, @RequestParam String password, ModelMap model) {

//        System.out.println(session.getAttribute("username"));
//        if (session.getAttribute("username") != null) {
////                return "redirect:/shoppingList";
//        }

            if (username.equals("leif") && password.equals("stockholmärmitthjärta")) {
                    return "redirect:invoice";
            }
            return "home";



//        if (authService.checkIfValidLogin(username,password))
//            return "redirect:invoice";
//        else{
//            model.put("error","incorrect Username or Password");
//            return "home";
//        }
        }
    }


