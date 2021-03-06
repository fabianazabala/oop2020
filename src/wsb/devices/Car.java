package wsb.devices;

import java.util.HashMap;
import wsb.creatures.Human;
import wsb.Soldable;

import java.util.Comparator;

public abstract class Car extends Device implements Soldable, Comparable<Car> {
    public final Integer yearOfProduction;
    public final Double sizeOfAnEngine;
    public String plates;
    public Engine engine;
    public boolean isRunning;

    public Car(String producer, String model, Integer yearOfProduction, Double sizeOfAnEngine) {
        super(producer, model);
        this.engine = new Engine();
        this.yearOfProduction = yearOfProduction;
        this.sizeOfAnEngine = sizeOfAnEngine;
    }

    abstract public void refuel();

    @Override
    public void turnOn() {
        isRunning = true;
        engine.turnOn();
    }

    public void stopCar(){
      isRunning = false;
      engine.turnOff();
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.plates;
    }

    @Override
    public int compareTo(Car otherCar) {
        return this.yearOfProduction - otherCar.yearOfProduction;
    }

  public Engine getEngine() {
    return engine;
  }

  @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if(!seller.hasACar(this)){
            throw new Exception("the seller do not have a car");
        }
        if(!buyer.hasAFreePlace()){
            throw new Exception("bouer do not have a plase");
        }
        if(buyer.cash < price){
            throw new Exception("not possible");
        }
        buyer.removeCar(this);
        seller.addCar(this);
        buyer.cash -= price;
        seller.cash += price;
        System.out.println("Cool, the transaction is done");
    }

    private static class Engine{
        private double horsePower;
        private double volume;
        private double milage;


        private void turnOn(){
            System.out.println("The car is ready to go");
        }

        private void turnOff(){
          System.out.println("The car is stopped.");
        }
    }
}