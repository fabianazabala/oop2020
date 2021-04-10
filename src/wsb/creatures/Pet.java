package wsb.creatures;

public class Pet extends Animal {
    public Pet(String name, String species, FoodType crops, double weight) {
        super(name, species, FoodType.meat, weight);
    }
}
