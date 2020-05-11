import java.util.Scanner;

public class kodu1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta 10 arvu: ");

        float one = scanner.nextFloat();
        float two = scanner.nextFloat();
        float three = scanner.nextFloat();
        float four = scanner.nextFloat();
        float five = scanner.nextFloat();
        float six = scanner.nextFloat();
        float seven = scanner.nextFloat();
        float eight = scanner.nextFloat();
        float nine = scanner.nextFloat();
        float ten = scanner.nextFloat();
        scanner.close();

        float summa = one+two+three+four+five+six+seven+eight+nine+ten;
        float korrutis = one*two*three*four*five*six*seven*eight*nine*ten;
        double keskmine = summa/10;
        //float ruutjuur = sqrt;


        System.out.println("Nende arvude summa on: " + summa);
        System.out.println("Nende arvude korrutis on: " + korrutis);
        System.out.println("Nende arvude korrutise ruutjuut on: " + Math.sqrt(korrutis));
        System.out.println("Nende arvude keskmine on:" + keskmine);
    }
}