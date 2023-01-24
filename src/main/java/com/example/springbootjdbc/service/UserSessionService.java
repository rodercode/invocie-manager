package com.example.springbootjdbc.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

@Service
public class UserSessionService {

    public void createSession(HttpSession session,String username){
        session.setAttribute("username", username);
        session.setMaxInactiveInterval(60 * 30);
        System.out.println(session.getAttribute("username"));
    }


}
