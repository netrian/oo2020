import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class HarderDaddy {

    public static void main(String[] args) throws FileNotFoundException {
        List<String> lastLetters = new ArrayList<String>();
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        
        try {
            File file = new File("text.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String data = scanner.nextLine();
            String[] words = data.split(" ");

            if(data.length() > 0){
                for(String word:words){
                    word = word.replaceAll("[^a-zA-Z]", "");
                    String lastLetter = word.substring(word.length()-1);
                    lastLetters.add(lastLetter);
                    char lastWordLetter = lastLetter.charAt(0);

                    if(hashMap.containsKey(lastWordLetter)){
                        hashMap.put(lastWordLetter, 1);
                    } else{
                        int value = hashMap.get(lastWordLetter);
                        value = value+1;
                        hashMap.put(lastWordLetter, value);
                    }
                    
                }
                Collections.sort(lastLetters);
            }
        }
        scanner.close();
        } catch (Exception e) {
            
        }
        
    }
}
