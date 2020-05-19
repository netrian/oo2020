package com.example.homework.controller;

import com.example.services.JokeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    @GetMapping("/joke")
    public String getJoke(Model model){
        model.addAttribute("joke", JokeService.getJokes());
        return "joke";
    }
}