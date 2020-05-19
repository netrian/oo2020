package com.example.homework.repository;

import java.util.ArrayList;
import java.util.List;

public class JokeRepo {
    public static List<String> jokesList = new ArrayList<>();

    public static List<String> addJoke(){
        jokesList = List.of(
            new String("I can’t believe I got fired from the calendar factory: all I did was take a day off!"),
            new String("Money talks: mine always says is goodbye."),
            new String("I went to see the doctor about my short-term memory problems — the first thing he did was make me pay in advance."),
            new String("You have two parts of the brain, “left” and “right” — in the left side, there’s nothing right and in the right side, there’s nothing left."),
            new String("Why do bees hum? They don’t remember the lyrics!"),
            new String("I have a dog to provide me with unconditional love but I also have a cat to remind me that I don’t deserve it: it’s all about balance."),
            new String("Don’t spell part backwards. It’s a trap."),
            new String("Today a man knocked on my door and asked for a small donation towards the local swimming pool. I gave him a glass of water."),
            new String("Most people are shocked when they find out how bad I am as an electrician."),
            new String("I find it ironic that the colors red, white, and blue stand for freedom until they are flashing behind you."),
            new String("Is your ass jealous of the amount of shit that just came out of your mouth?"),
            new String("Moses had the first tablet that could connect to the cloud.")
        );
        return jokesList;
    }
}