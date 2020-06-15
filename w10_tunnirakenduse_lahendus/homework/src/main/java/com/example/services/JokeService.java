package com.example.services;

import java.util.List;
import com.example.homework.repository.JokeRepo;

public class JokeService {
    public static List<String> getJokes(int result){
        return JokeRepo.addJoke();
    }

   
}