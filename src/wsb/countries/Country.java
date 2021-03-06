package wsb.countries;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public enum Country {
  URUGUAY("Uruguay", "Spanish", "ISO 3166-2:UY", 59918000),
  COLOMBIA("Colombia", "Spanish", "ISO 3166-2: CO", 61026000),
  BRAZIL("Brasil", "Portuguese", "ISO 3166-2: BR",  300358000),
  SPAIN("Spain", "Spanish", "ISO 3166-2:ES", 1119976000),
  ITALY("Italy", "Italian", "ISO 3166-2:IT", 1651595000);


  private final String name;
  private final String language;
  private final String code;
  private final long GDP;


  Country(String name, String language, String code, long gdp) {
    this.name = name;
    this.language = language;
    this.code = code;
    GDP = gdp;
  }

  public double convertGDPtoPLN(){
   return this.GDP * 3.71;
  }

  public long getGDP() {
    return GDP;
  }
}
