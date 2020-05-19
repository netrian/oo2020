public class Keg {
    double volume;
    double maxVolume;
    Drink drink;

    public Keg(Drink drink, double volume, double maxVolume) {
        this.drink = drink;
        this.volume = volume;
        this.maxVolume = maxVolume;
    }

    public void fill(){
        if (Keg.volume >= Bottle.bottleMaxVol - Bottle.bottleVol) {
            
        }
    }
}