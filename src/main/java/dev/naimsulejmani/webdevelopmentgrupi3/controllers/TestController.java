package dev.naimsulejmani.webdevelopmentgrupi3.controllers;

import dev.naimsulejmani.webdevelopmentgrupi3.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class TestController {
    private int indexCounter = 0;
    private int aboutCounter = 0;
    private int contactCounter = 0;
    private int booksCounter = 0;
    private int timeCounter = 0;
    private LocalDateTime createdDateTime = LocalDateTime.now();
    @GetMapping("/")
    public String index() {
        indexCounter++;

        return "index";
    }

    //generate about page
    @GetMapping("/about")
    public String about(Model model) {
        aboutCounter++;
        model.addAttribute("message", "About page!");
        model.addAttribute("year", 2024);
        model.addAttribute("salary", 350.55);
        return "about";
    }

    //generate contact page
    @GetMapping("/contact")
    public String contact() {
        contactCounter++;
        return "contact";
    }

    //generate books page
    @GetMapping("/books")
    public String books(Model model) {
        booksCounter++;
        var book = new Book("1234567890", "Spring in Action",
                "Craig Walls", 2009, 49.99);
        model.addAttribute("book", book);

        return "books";
    }

    @GetMapping("/time")
    public String getTime(Model model) {
        timeCounter++;
        var time = LocalDateTime.now();
        model.addAttribute("time", time);
        model.addAttribute("createdDateTime", createdDateTime);
        return "time";
    }
    //stats page
    @GetMapping("/stats")
    public String getStats(Model model) {

        model.addAttribute("indexCounter", indexCounter);
        model.addAttribute("aboutCounter", aboutCounter);
        model.addAttribute("contactCounter", contactCounter);
        model.addAttribute("booksCounter", booksCounter);
        model.addAttribute("timeCounter", timeCounter);
        return "stats";
        }

}










