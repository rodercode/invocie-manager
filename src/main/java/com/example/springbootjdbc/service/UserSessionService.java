package com.example.springbootjdbc.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Service
public class UserSessionService {

    public void createSession(HttpSession session,String username){
        session.setAttribute("username", username);
        session.setMaxInactiveInterval(60 * 30);
    }
    public void emptySession(HttpSession session) throws IOException {
        session.invalidate();
    }


}
