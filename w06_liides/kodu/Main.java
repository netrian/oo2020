import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean agro;
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is your animal agressive?");
        String input = scanner.next();

        if(input.equals("Y")){
            agro = true;
        } else if (input.equals("Yes")) {
            agro = true;
        } else {
            agro = false;
        }

        cat1.sleep(19);
        cat1.attack(agro);
        cat1.voice();
        System.out.println("_________________________________");
        dog1.sleep(9);
        dog1.attack(agro);
        dog1.voice();


        scanner.close();
    }
}
