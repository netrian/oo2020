package com.example.services;

import java.util.List;
import java.util.Random;

import com.example.homework.repository.JokeRepo;

public class JokeService {
    public static List<String> getJokes(){
        Random random = new Random();
        return JokeRepo.addJoke();
    }

   
}