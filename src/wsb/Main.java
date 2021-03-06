package wsb;

import java.util.TreeMap;
import wsb.countries.CapitalCities;
import wsb.countries.Country;
import wsb.devices.Car;
import wsb.devices.DieselCar;

public class Main {
    public static void main(String[] args) {

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





    }
}
