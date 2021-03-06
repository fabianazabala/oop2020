package wsb.creatures;

public class FarmAnimal extends Animal implements Edible{

    public FarmAnimal(String species) {
        super(species, FoodType.all);
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
