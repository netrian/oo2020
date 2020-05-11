import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("text.txt")));
        printLastChar(text);
    }

    public static void printLastChar(String text){
        int chars;
        text = text + " ";
        for(chars=0; chars<text.length(); chars++){
            if(text.charAt(chars)==' '){
                System.out.println(text.charAt(chars-1)+" ");
            }
        }
    }
}