package wsb.creatures;

import java.io.File;

public class Animal implements Feedable, Comparable<Animal> {
    final String species;
    private Double weight;
    public String name;
    File pic;
    final FoodType foodType;

    private static Double NEW_DOG_WEIGHT = 4.0;
    private static Double NEW_LION_WEIGHT = 39.2;
    private static Double NEW_OTHER_ANIMAL_WEIGHT = 5.3;

    private static Double DEFAULT_FEED_WEIGHT = 1.0;

    public Animal(String name, String species,
                  FoodType foodType,
                  Double weight) {
        this.name = name;
        this.foodType = foodType;
        this.species = species;
        this.weight = weight;

        switch (species) {
            case "dog" -> {
                weight = NEW_DOG_WEIGHT;
            }
            case "lion" -> {
                weight = NEW_LION_WEIGHT;
            }
            default -> {
                weight = NEW_OTHER_ANIMAL_WEIGHT;
            }
        }
    }

    public void feed(FoodType foodType) {
        /*String message;
        message = switch (foodType){
            case all -> "50% mass of food will be build into body mass";
            case meat -> "70% mass of food will be build into body mass";
            case crops -> "30% mass of food will be build into body mass";
        };

         */
        switch (species){
            case "dog" -> feed(FoodType.all);
            case "lion" -> feed(FoodType.meat);
            default -> feed(FoodType.crops);
        }

    }

    @Override
    public void feed() {
        System.out.println("Fed already");
    }

    public void feed(Double foodWeight) {
        if (weight == 0) {
            System.out.println("It's too late, " + name + " is dead");
        } else {
            weight += foodWeight;
            System.out.println(name + " says thank you for this food");
        }
    }

    public void takeForAWalk() {
        if (weight == 0.0) {
            System.out.println("It's not ok to walk the street with dead animal!!! you freak");
        } else if (weight > 3.0) {
            --weight;
            System.out.println(name + " says thank you for the walk");
        } else if (weight > 1.0) {
            --weight;
            System.out.println(name + " says thank you for a walk but I am hungry now");
        } else {
            weight = 0.0;
            System.out.println(name + " died");
        }
    }

    Double getWeight() {
        return weight;
    }

    protected void kill() {
        System.out.println("bye!!!");
        this.weight = 0.0;
    }

    public String toString() {return this.name;}

    @Override
    public int compareTo(Animal o) {
        return this.species.compareTo(o.species);
    }

}
