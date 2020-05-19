/**
 * Drink
 */
public class Drink {

    String drinkName;
    double litrePrice;
    float density;

    public Drink(String drinkName, double litrePrice, Float density) {
        this.drinkName = drinkName;
        this.litrePrice = litrePrice;
        this.density = density;
    }

    @Override
    public String toString(){
        return "This is " + drinkName + ".\nIt's price per liter is " + litrePrice + " euros\nIt's density is " + density + " grams per litre.";
    }
}