//Tabla de Simbolos
import java.util.*;

public class TablaSimbolos
{
  HashMap t;

  //Constructor
  public TablaSimbolos()
  {
    t = new HashMap();
  }

  //Inserta nuevo Simbolo a la tabla
  public Simbolo insertar(String nombre)
  {
    Simbolo s = new Simbolo(nombre, "");
    t.put(nombre, s);
    return s;
  }

  //Busca un simbolo en la tabla
  public Simbolo buscar(String nombre)
  {
    return (Simbolo)(t.get(nombre));
  }

  //Imprime todo los Simbolos de la tabla
  public void imprimir()
  {
    Iterator it = t.values().iterator();
    while(it.hasNext())
    {
      Simbolo s = (Simbolo)it.next();
      System.out.println(s.nombre + "; "+ s.valor);
    }
  }
}