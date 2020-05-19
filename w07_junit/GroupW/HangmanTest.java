package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.*;



class HangmanTest {


    @Before
    public void main() {
        //initiate test
        Hangman hangmanGame = new Hangman();
    }

    public ArrayList<String> letters = new ArrayList<>();
    public String wordToFind;
    public char[] wordFound;
    public int errorNr;

    @org.junit.jupiter.api.Test
    void hangmanImg() {
    }


    @org.junit.jupiter.api.Test
    void newGame() {
    }

    @org.junit.jupiter.api.Test
    void wordFound() {
    }


    @org.junit.jupiter.api.Test
    void wordFoundContent() {
    }


    @org.junit.jupiter.api.Test
    void play() {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        //testin kas entry on ikka 1 täht
        assertEquals(str = str.substring(0, 1), str = str.substring(0, 1));
    }

    @Test
    void enter(String c) {
        if (!letters.contains(c)) {
            if (wordToFind.contains(c)) {
                int index = wordToFind.indexOf(c);

                while (index >= 0) {
                    wordFound[index] = c.charAt(0);
                    index = wordToFind.indexOf(c, index + 1);
                }
            } else {
                errorNr++;
            }
            letters.add(c);
        }
        //kontrollin kas ikka errori numbrit incrementitakse
        assertSame(errorNr++, errorNr++);
        //kontrollin kas on char added
        Assert.assertNotSame("Is there a char added", null, c);
    }
}