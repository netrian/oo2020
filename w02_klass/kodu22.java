import java.util.Scanner;

public class kodu22{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta enda nime ja sünniaasta");
        String name = scanner.nextLine();
        int birthyear = scanner.nextInt();
        scanner.close();;

        kodu2 human = new kodu2(name, birthyear);
        System.out.println("Su nimi on " + name + " ning sa" + human.getYear());
    }
}