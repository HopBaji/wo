package com.example.solarv2.controller;

import com.example.solarv2.Reposit.AdvertiRep;
import com.example.solarv2.model.Advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class loginController {
    @GetMapping("/start")
    public String net(){
        return "start";
    }
    @GetMapping("/login")
    public String login() {
        return "login1";
    }
    @GetMapping("/register")
    public String register() {
        return "register";
    }
    @Autowired
    private AdvertiRep advertiRep;
    @GetMapping("/")
    public String ViewAdvertisement(Model model) {
        Iterable<Advertisement> Advertisement = advertiRep.findAll();
        model.addAttribute("Advertisement", Advertisement);
        return "home";
    }
}
