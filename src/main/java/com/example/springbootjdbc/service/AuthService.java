package com.example.springbootjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final CoworkerService personService;
    @Autowired
    public AuthService(CoworkerService personService) {
        this.personService = personService;
    }

    public boolean checkIfValidLogin(String username, String password){
        boolean isUsernameValid = personService.selectUserByUsername(username).equals(username);
        boolean isPasswordValid = personService.selectUserByPassword(password).equals(password);
        return isUsernameValid && isPasswordValid;
    }


}
