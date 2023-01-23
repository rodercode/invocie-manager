package com.example.springbootjdbc.service;

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

    public void selectUserByUsername(String username){
        if (personRepo.selectPersonByUsername(username) != null)
            return personRepo.selectPersonByUsername(username).getUsername();
        return "";
    }

    






}
