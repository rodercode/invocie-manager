package com.example.springbootjdbc.test;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class HomeController {

    private CopyOnWriteArrayList<Avenger> avengerList;

    public HomeController() {
        avengerList = new CopyOnWriteArrayList<>();
    }

    @GetMapping("/")
    public String goHome(ModelMap model){
        model.addAttribute("avengerList", avengerList);
    return "index";
    }

    @GetMapping("/addPage")
    public String goToAdd(ModelMap model){
        Avenger avenger = new Avenger();
        avenger.setName("Ironman");
        avenger.setAge(43);
        avenger.setPowerSource("iron suit");

        model.addAttribute("avenger", avenger);
        return "add_avenger";
    }
}
