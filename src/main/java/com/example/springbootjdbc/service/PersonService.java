package com.example.springbootjdbc.service;

import com.example.springbootjdbc.model.Person;
import com.example.springbootjdbc.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepo personRepo;
    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }
    public String selectUserByUsername(String username){
        if (personRepo.selectPersonByUsername(username) != null)
            return personRepo.selectPersonByUsername(username).getUsername();
        return "";
    }

    public String selectUserByPassword(String password){
        if (personRepo.selectPersonByPassword(password) != null)
            return personRepo.selectPersonByPassword(password).getPassword();
        return "";
    }
}
