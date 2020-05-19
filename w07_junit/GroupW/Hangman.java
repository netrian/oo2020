

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman implements HangmanInterface {

    public static String[] WORDS = { "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS",
            "CONST", "CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY",
            "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE",
            "NEW", "NULL", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP",
            "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE", "TRY", "VOID",
            "VOLATILE", "WHILE" };

    public static Random random = new Random();
    public static int MAX_ERRORS = 8;
    public String wordToFind;
    public char[] wordFound;
    public int errorNr;
    public ArrayList<String> letters = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Let's start a new hangman game. Guess Java keywords.");
        Hangman hangmanGame = new Hangman();
        hangmanGame.newGame();
        hangmanGame.play();
    }

    private String nextWordToFind() {
        return WORDS[random.nextInt(WORDS.length)];
    }

    public void newGame() {
        errorNr = 0;
        letters.clear();
        wordToFind = nextWordToFind();

        wordFound = new char[wordToFind.length()];

        for (int i = 0; i < wordFound.length; i++) {
            wordFound[i] = '_';
        }
    }

    public boolean wordFound() {
        return wordToFind.contentEquals(new String(wordFound));
    }


    @Override
    public String wordFoundContent() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < wordFound.length; i++) {
            builder.append(wordFound[i]);

            if (i < wordFound.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    @Override
    public void play() {

        try (Scanner input = new Scanner(System.in)) {
            while (errorNr < MAX_ERRORS) {
                System.out.println("\nEnter a letter : ");
                String str = input.next();


                // we keep just first letter
                if (str.length() > 1) {
                    str = str.substring(0, 1);
                }

                // update word found, added so .toUpperCase so user can enter via lowercase as well
                enter(str.toUpperCase());

                // display current state
                System.out.println("\n" + wordFoundContent());

                // check if word is found
                if (wordFound()) {
                    System.out.println("\nYou win!");
                    break;
                } else {
                    System.out.println("\n=> Nr tries remaining : " + (MAX_ERRORS - errorNr));
                    HangmanInterface.hangmanImg(errorNr);
                }
            }

            if (errorNr == MAX_ERRORS) {
                // user lost
                System.out.println("\nYou lose!");
                System.out.println("The word was : " + wordToFind);
            }
        }

    }

    @Override
    public void enter(String c) {
        if (!letters.contains(c)) {
            if (wordToFind.contains(c)) {
                int index = wordToFind.indexOf(c);

                while (index >= 0) {
                    wordFound[index] = c.charAt(0);
                    index = wordToFind.indexOf(c, index + 1);
                }

            } else {
                // c not in the word => error
                errorNr++;
            }

            // c is now a letter entered
            letters.add(c);

        }

    }

}