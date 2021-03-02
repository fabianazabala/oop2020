package wsb.creatures;

import wsb.devices.Car;
import wsb.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Pet pet;
    public Phone mobile;
    public Car[] garage;

    public Animal[] farm;

    protected String phoneNumber;
    private Double salary;
    public Double cash = 200.0;

    private static final int DEFAULT_FARM_SIZE = 3;
    private static final int DEFAULT_GARAGE_SIZE = 3;
    private static Double DEFAULT_FEED_WEIGHT = 1.5;

    public Human(Integer farmSize, Integer garageSize) {
        super("homo sapiens", FoodType.all);
        this.farm = new Animal[farmSize];
        this.garage = new Car[garageSize];
    }

    public Human(Integer farmSize) {
        super("homo sapiens", FoodType.all);
        this.farm = new Animal[farmSize];
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human() {
        super("homo sapiens", FoodType.all);
        this.farm = new Animal[DEFAULT_FARM_SIZE];
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Double getSalary() {
        return salary;
    }

    public void sell() throws Exception {
        throw new Exception("don't do this freak");
    }

    public void eat() throws Exception {
        throw new Exception("don't do this freak");
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " I'm a human";
    }

    public void feed() {
        System.out.println("I'm a human I will use fork and knife");
        super.feed(DEFAULT_FEED_WEIGHT);
    }

    public Double valueOfCars() {
        Double value = 0.0;
        for (Car car : garage) {
            if (car != null) {
                value += car.value;
            }
        }
        return value;
    }

    public Car getCar(Integer index) {
        return this.garage[index];
    }

    public void setCar(Car car, Integer index) {
        this.garage[index] = car;
    }

    public boolean hasACar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAFreePlace() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
            }
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                break;
            }
        }
    }
}
class Personality{

    private final boolean senseOfHumor;
    private final boolean romantic;
    private final boolean goodPerson;
    private final double iq;
    private final boolean nerd;

    public Personality(boolean senseOfHumor, boolean romantic, boolean goodPerson, double iq, boolean nerd) {
        this.senseOfHumor = senseOfHumor;
        this.romantic = romantic;
        this.goodPerson = goodPerson;
        this.iq = iq;
        this.nerd = nerd;
    }

    /* TASK 7
    Create a private inner class engine inside a car.
    Move turnOn() method to the new class.
    Add fields horsePower and volume and milage.
    Add Engine engine field to a car and create an engine in the car constructor.
    Add isRunning boolean field to a car.
        Add startACar() method to a car which will run turnOn() method on engine.
        TurnOn() method should print some funny text and change isRunnig value.
    Add stopACar() method as analogy.

     */
}
