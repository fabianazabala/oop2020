package wsb.annot;

import java.lang.reflect.Field;

public class ObjectToSQLConverter {
  public String insert(Object object) throws IllegalAccessException{

    String mySQL = "Insert into: " + object.getClass().getSimpleName();
    mySQL += " values(";

    for (Field field : object.getClass().getDeclaredFields()){
      field.setAccessible(true);
      mySQL += field.get(object) + ", ";
    }

    mySQL += ");";

    return mySQL;
  }
}
