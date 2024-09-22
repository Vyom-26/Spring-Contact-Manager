package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("about page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("services page loading");
        return "services";
    }

    @RequestMapping("/home")
    public String homePage(){
        System.out.println("home page loading");
        return "home";
    }
}
