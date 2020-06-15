package com.example.homework.controller;

import java.util.Random;

import com.example.services.JokeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    @GetMapping("/joke")
    public String getJoke(Model model){
        Random r = new Random();
        int low = 0;
        int high = 11;
        int result = r.nextInt(high-low) + low;
        model.addAttribute("joke", JokeService.getJokes(result));
        return "joke";
    }
}