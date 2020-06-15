import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        List<String> lastLetters = new ArrayList<String>();
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        try {
            File file = new File("text.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                String[] splitter = text.split(" ");

                if (text.length() > 0) {
                    for (String words : splitter) {
                        words = words.replaceAll("[^a-zA-Z]", "");
                        String word = words.substring(words.length() - 1);
                        lastLetters.add(word);
                        char wordChar = word.charAt(0);

                        if (!hashMap.containsKey(wordChar)) {
                            hashMap.put(wordChar, 1);
                        } else {
                            int value = hashMap.get(wordChar);
                            value = value + 1;
                            hashMap.put(wordChar, value);
                        }
                    }
                    Collections.sort(lastLetters);
                }
            }
            scanner.close();
            //System.out.println(lastLetters);
        } catch (Exception e) {
            e.printStackTrace();
        }

       Map<Character, Integer> sortedMap = (Map<Character, Integer>) hashMap.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

                    System.out.println(sortedMap);

        }
              

       /*  public static void saveAsFile(String word, String lastLetter){
            try {
                FileWriter fileWriter = new FileWriter(lastLetter + ".txt", true);
            fileWriter.write(word+"\n"); 
            fileWriter.close();
            } catch (Exception e) {
               
            }
            
        } */
}
