package com.example.springboot.intro.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value={"", "/", "home"})
    public String displayHomePage(){
        return "home.html";
    }

//    @RequestMapping(value={"", "/", "home"})
//    public String displayHomePage(Model model) {
//        model.addAttribute("username", "Akarsh Yadav");
//        return "home.html";
//    }
}



