import java.util.Scanner;


public class MainPC{
    public static void main(String[] args){
        System.out.println("Enter your personal code: ");
        Scanner scanner = new Scanner(System.in);
        EstPC test = new EstPC();
        String personalCode = scanner.next();
        test.getGender(personalCode);
        test.getYear(personalCode);
        test.getBirthday(personalCode);
        scanner.close();
    }
}