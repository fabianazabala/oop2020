package wsb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;
import wsb.countries.CapitalCities;
import wsb.countries.Country;
import wsb.creatures.Animal;
import wsb.creatures.FarmAnimal;
import wsb.creatures.FoodType;
import wsb.creatures.Human;
import wsb.creatures.Pet;
import wsb.devices.Car;
import wsb.devices.Device;
import wsb.devices.DieselCar;
import wsb.devices.OperatingSystem;
import wsb.devices.Phone;

public class Main {
  public static void main(String[] args) {

        /*
        System.out.println(Country.COLOMBIA.convertGDPtoPLN());

        CapitalCities capitalCities = new CapitalCities();

        capitalCities.addCapitalCities(Country.COLOMBIA, "Bogota");
        capitalCities.addCapitalCities(Country.URUGUAY, "Montevideo");
        capitalCities.addCapitalCities(Country.BRAZIL, "Brazilia");
        capitalCities.replacingCapitalCities(Country.BRAZIL, "Rio de Janeiro");
        System.out.println(capitalCities.getCapitalCities(Country.URUGUAY));
        capitalCities.removingCountry(Country.BRAZIL);
        capitalCities.iterateCapitalCities();
        System.out.println(capitalCities.sortingCapitalCities());

        TreeMap<String, Car> trucks = new TreeMap<>();

        Car impala = new DieselCar("Chevrolet", "impala", 2010, 12.5);
        Car camaro = new DieselCar("Chevrolet", "camaro", 2010, 12.5);
        Car malibu = new DieselCar("Chevrolet", "malibu", 2010, 12.5);

        trucks.put("impala", impala);
        trucks.put("camaro", camaro);
        trucks.put("malibu", malibu);

        System.out.println(trucks);

        HashMap<Country, Double> area = new HashMap<>();
        area.put(Country.ITALY, 301338.0);
        area.put(Country.SPAIN, 487736.0);
        area.put(Country.BRAZIL, 2637468.0);
        area.put(Country.COLOMBIA, 987654.0);
        area.put(Country.URUGUAY, 201223.0);

        Country largestCountry = area.entrySet().stream()
            .max(Comparator.comparingDouble(Map.Entry::getValue))
            .get().getKey();

        Country smallestCountry = area.entrySet().stream()
            .min(Comparator.comparingDouble(Map.Entry::getValue))
            .get().getKey();

        System.out.println(largestCountry + " - " + smallestCountry);

        Phone amazing = new Phone("Siemens", "amazing", 3.0, OperatingSystem.WindowsMobile);
        Phone s65 = new Phone("Siemens", "s65", 3.0, OperatingSystem.WindowsMobile);
        Car escape = new DieselCar("Ford", "Escape", 20220, 13.0);
        Car flex = new DieselCar("Ford", "Flex", 20220, 13.0);

        HashMap<String, List<Device>> producers = new HashMap<>();
        producers.put("Siemens", List.of(amazing, s65));
        producers.put("Ford", List.of(escape, flex));

        System.out.println("Siemens devices: " + producers.get("Siemens"));
        System.out.println("Ford devices: " + producers.get("Ford"));

        Map<Integer, String> hashMapExample = new HashMap<>();

        IntStream.range(0, 1000)
            .forEach(i -> hashMapExample.put(i, "entry"));

        System.out.println(hashMapExample.size());

        Map<Integer, String> concurrentHashMapExample = new ConcurrentHashMap<>();

        IntStream.range(0, 1000)
            .parallel()
            .forEach(i -> concurrentHashMapExample.put(i, "entry"));

        System.out.println(concurrentHashMapExample.size());

        malibu.turnOn();
        System.out.println(malibu.isRunning);
        malibu.stopCar();
        System.out.println(malibu.isRunning);
        */

    Animal elephant = new Animal("elephant", "Mammal", FoodType.crops, 6500.0);
    Animal cow = new FarmAnimal("cow", "mammal", 720.0);
    Animal pigglet = new FarmAnimal("pigglet", "farm animal", 20.0);
    Animal boy = new Human("Richard", 22.5);
    Animal baby = new Human("Shakira", 8.0);
    Animal bird = new Pet("turpial", "Bird", FoodType.crops, 0.7);

    List<Animal> animals = new ArrayList<>();
    animals.add(elephant);
    animals.add(boy);
    animals.add(bird);
    animals.add(pigglet);
    animals.add(cow);
    animals.add(baby);


    Collections.sort(animals);

    animals.forEach(System.out::println);


  }
}
