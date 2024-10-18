package dev.naimsulejmani.webdevelopmentgrupi3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    //generate about page
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    //generate contact page
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

}
