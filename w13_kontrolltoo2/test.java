import java.io.*;
import java.util.*;

/**
 * Main
 */
public class test {

    static String[] words;

    public static void main(String[] args) {
        try {
            File file = new File("D:\\UNI\\objektproge\\oo2020\\w13_kontrolltoo2\\text.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            words = data.split(" ");
        }
        scanner.close();
        } catch (Exception e) {
            System.out.println("File was not found");
            e.printStackTrace();
        }

        
    }

    public static HashMap<Character, Integer> countOcurrence(String[] array){
        HashMap<Character, Integer> lastLetters = new HashMap<Character, Integer>();
        for (int i = 0; i < array.length; i++) {
            if(lastLetters.containsKey(array[i].charAt(array[i].length()-1))){
                lastLetters.put(array[i].charAt(array[i].length()-1), lastLetters.get(array[i].charAt(array[i].length()-1))+1);
            } else {
                lastLetters.put(array[i].charAt(array[i].length()-1), 1);
            }
        }
        return lastLetters;
    }
}