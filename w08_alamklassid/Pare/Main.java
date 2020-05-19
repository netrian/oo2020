package Pare;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(null, null);

        System.out.println(
            child.armSlots + " " +
            child.legSlots
        );
        child.speak();
    }
}