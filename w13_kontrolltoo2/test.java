import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class test {
    // Function to print the first
    // and last character of each word.
    static void FirstAndLast(String str) {
        int i;

        for (i = 0; i < str.length(); i++) {

            // If it is the first word
            // of the string then print it.
            if (i == 0)
                System.out.print(str.charAt(i));

            // If it is the last word of the string
            // then also print it.
            if (i == str.length() - 1)
                System.out.print(str.charAt(i));

            // If there is a space
            // print the successor and predecessor
            // to space.
            if (str.charAt(i) == ' ') {
                System.out.print(str.charAt(i - 1) + " " + str.charAt(i + 1));
            }
        }
    }

    // Driver code
    public static void main(String args[]) throws IOException 
    { 
        String str = new String(Files.readAllBytes(Paths.get("text.txt")));
        //String str = "Geeks for Geeks"; 
        FirstAndLast(str); 
    } 
} 
