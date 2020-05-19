package kodu;

public class main {
    public static void main(String[] args) {
        shape shape1 = new triangle(13, 15, 25, 0, 10);

        System.out.println("Kolmnurga pindala on "+shape1.getPindala());
        System.out.println("Kolmnurga ümbermõõt on " + shape1.getYmbermoot());
    }
}