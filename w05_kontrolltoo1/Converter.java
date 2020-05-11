import java.util.Scanner;

public class Converter {

    private static Scanner dec;

    static void decimalToBinary(int N) {
        int[] binNum = new int[10000];
        int count = 0;

        while (N > 0) {
            binNum[count] = N % 2;
            N = N / 2;

            count++;
        }

        for (int j = count - 1; j >= 0; j--)
            System.out.print(binNum[j]);
    }

    static String decimalToOctadecimal(int N) {
        int store;
        String octal = "";
        char octaChar[] = { '0', '1', '2', '3', '4', '5', '6', '7' };

        while (N > 0) {
            store = N % 8;
            octal = octaChar[store] + octal;
            N = N / 8;
        }
        return octal;
    }

    static String decimalToHexadecimal(int N) {
        int store;
        String hex = "";
        char hexChar[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        while (N > 0) {
            store = N % 16;
            hex = hexChar[store] + hex;
            N = N / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        dec = new Scanner(System.in);
        System.out.println("Sisesta kümnendsüsteemi arv: ");
        int N = dec.nextInt();
        System.out.println("-------------------------------------");
        System.out.println("Arv " + N + " kahendsüsteemis on: ");
        decimalToBinary(N);
        System.out.println("");
        System.out.println("Arv " + N + " kaheksandsüsteemis on: ");
        System.out.println(decimalToOctadecimal(N));
        System.out.println("Arv " + N + " kuueteistkümnendsüsteemis on: ");
        System.out.println(decimalToHexadecimal(N));
        System.out.println("-------------------------------------");
    }
}