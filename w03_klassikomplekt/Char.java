/**
 * Chars
 */
import java.util.Scanner;

public class Char{
    static int MAX_CHAR = 256;

static void getOccuringChar(String str) {

    int count[] = new int[MAX_CHAR];
    int len = str.length();

    for (int i = 0; i < len; i++) {
        count[str.charAt(i)]++;
    }

    char ch[] = new char[str.length()];
    for (int i = 0; i < len; i++) {
        ch[i] = str.charAt(i);
        int find = 0;
        for (int j = 0; j <= i; j++) {
            if (str.charAt(i) == ch[j]) {
                find++;
            }
        }
        if (find == 1) {
            System.out.println("Tekstis esineb " + count[str.charAt(i)] + " " + str.charAt(i) + " tähte");
        }
    }
}

public static void main(String[] args) {    
    
        Scanner sc = new Scanner(System.in);
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        getOccuringChar(str);
    }
}