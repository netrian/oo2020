/**
 * Bottle
 */
public class Bottle {

    public enum BottleType{
        GLASS_BOTTLE,
        PLASTIC_BOTTLE,
        METAL_CAN
    }

    BottleType bottleType;
    double bottleMass;
    double bottlePrice;
    double bottleVol;
    double bottleMaxVol;
    Drink drink;

    public Bottle(Drink drink, Bottle.BottleType bottleType, double bottleMass, double bottlePrice, double bottleVol){
        this.drink = drink;
        this.bottleType = bottleType;
        this.bottleMass = bottleMass;
        this.bottlePrice = bottlePrice;
        this.bottleVol = bottleVol;
    }

    @Override
    public String toString(){
        return "This is a " + bottleType + " that contains " + drink.drinkName + ".\nIt weighs " + bottleMass + " kg, can contain " + bottleVol + " litres of any beverage and its tare price is " + bottlePrice + " euros";
    }
}