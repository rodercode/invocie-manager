package com.example.springbootjdbc.Controllers;

import com.example.springbootjdbc.service.AuthService;
import com.example.springbootjdbc.service.UserSessionService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class CoworkerController {

    private final AuthService authService;
    private final UserSessionService userSessionService;


    //    @PostMapping("logout")
//    public String logout(HttpSession session) throws IOException {
//        session.invalidate(); //Invalidate - empty the session
//        return "redirect:/index.html";
//    }
    @Autowired
    public CoworkerController(AuthService authService, UserSessionService userSessionService) {
        this.authService = authService;
        this.userSessionService = userSessionService;
    }


    @PostMapping("home")
    public String login(HttpSession session, @RequestParam String username, @RequestParam String password, ModelMap model) throws IOException {
        if (authService.checkIfValidLogin(username, password)) {
            userSessionService.createSession(session, username);
            System.out.println(session.getAttribute("username"));
            return "redirect:invoice";
        } else {
            model.put("error", "incorrect Username or Password");
            return "home";
        }
    }
}


