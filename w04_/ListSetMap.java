import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/**
 * ListSetMap
 */
public class ListSetMap {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Ford");
        cars.add("Audi");
        System.out.println(cars);
       /*  for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        } */

        HashMap<String, String> cities = new HashMap<String, String>();
        cities.put("Estonia", "Tallinn");
        cities.put("Russia", "Moscow");
        cities.put("Finland", "Helsinki");
        cities.put("Sweden", "Stockholm");
        System.out.println(cities);
        /* for (String i : cities.keySet()) {
            System.out.println("key: " + i + " value: " + cities.get(i));
          } */

        HashSet<String> carsSet = new HashSet<String>();
        carsSet.add("Audi");
        carsSet.add("Ford");
        carsSet.add("Honda");
        carsSet.add("Hyundai");
        carsSet.add("Ford");
        carsSet.add("Audi");
        System.out.println(carsSet);
    }
}