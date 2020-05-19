package com.example.model;

public class Character {
    public int x;
    public int y;
    public String name;
    public char gender;
    public String type;

    public Character(String name, char gender, String type){
        this.x = 5;
        this.y = 5;

        this.name = name;
        this.gender = gender;
        this.type = type;
    }
}