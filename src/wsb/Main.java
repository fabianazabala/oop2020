package wsb;

import java.util.HashMap;
import wsb.countries.CapitalCities;
import wsb.countries.Country;

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

    }
}
