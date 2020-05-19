/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Drink cocacola = new Drink("Coke", 1, (float) 0.37);
        Bottle plasticBottle = new Bottle(cocacola, Bottle.BottleType.PLASTIC_BOTTLE, .1, .1, 1);

        System.out.println(cocacola);
        System.out.println("");
        System.out.println(plasticBottle);
    }
}