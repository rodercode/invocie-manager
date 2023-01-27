package com.example.springbootjdbc.Controllers;
import com.example.springbootjdbc.model.Invoice;
import com.example.springbootjdbc.service.AuthService;
import com.example.springbootjdbc.service.CoworkerService;
import com.example.springbootjdbc.service.UserSessionService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;

@Controller
public class CoworkerController {
    private final AuthService authService;
    private final UserSessionService userSessionService;
    @Autowired
    public CoworkerController(AuthService authService, UserSessionService userSessionService) {
        this.authService = authService;
        this.userSessionService = userSessionService;
    }
    @PostMapping("home")
    public String login(HttpSession session, @RequestParam String username, @RequestParam String password, ModelMap model) throws IOException {

        if (username.equals("") || password.equals("") ) {
            model.addAttribute("error", "incorrect Username or Password");
            return "home";
        }
        else if (authService.checkIfValidLogin(username, password)) {
            userSessionService.createSession(session, username);
            return "redirect:invoice";
        }else {
            model.addAttribute("error", "incorrect Username or Password");
            return "home";
        }
    }
    @GetMapping("edit")
    public String logout(HttpSession session) throws IOException {
        userSessionService.emptySession(session);
        return "redirect:home";
    }
}