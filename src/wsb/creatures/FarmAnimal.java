package wsb.creatures;

public class FarmAnimal extends Animal implements Edible{

    public FarmAnimal(String name, String species, double weight) {
        super(name, species, FoodType.all, weight);
    }

    @Override
    public void beEaten() throws Exception {
        this.kill();
        System.out.println("that was tasty");
    }

    @Override
    public void feed() {
        System.out.println("eating");
    }
}
