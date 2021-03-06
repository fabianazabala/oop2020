package wsb.countries;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class CapitalCities {


  HashMap<Country, String> capitalCities = new HashMap<>();


  public void addCapitalCities(Country country, String capital) {
    capitalCities.put(country, capital);
  }

  public String getCapitalCities(Country country) {
    return capitalCities.get(country);

  }

  public void removingCountry(Country country) {
    capitalCities.remove(country);
  }

  public void replacingCapitalCities(Country country, String newCapital) {
    capitalCities.replace(country, newCapital);

  }

  public void iterateCapitalCities() {
    capitalCities.forEach((key, value) -> System.out.println(key + " = " + value));
  }


  public TreeMap<Country, String> sortingCapitalCities() {
    TreeMap<Country, String> map = new TreeMap<>(Comparator.comparing(Country::getGDP).reversed());
    map.putAll(capitalCities);
    return map;
  }

}
