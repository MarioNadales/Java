import java.util.Scanner;
import java.util.ArrayList;
public class PruebaProducto {
  public static void main(String[] args) {
    ArrayList<Producto> prod= new ArrayList<Producto>();
  Producto p1=new Producto("Pan");
  Producto p2=new Producto("Leche");
  Producto p3=new Producto("Fruta");
  Producto p4=new Producto("Agua");
  Producto p5=new Producto("Cerveza");
  
  prod.add(p1);
  prod.add(p2);
  prod.add(p3);
  prod.add(p4);
  prod.add(p5);
  //Primer bucle para imprimir el array completo
  System.out.println("Primer bucle");
  for (int i=0;i<5;i++) {
    System.out.println(" "+prod.get(i).getNombre());
  }

  System.out.println("Segundo bucle");
  //Eliminar dos posiciones y añadir una
  prod.remove(1);
  prod.remove(2);
  prod.add(p2);
  //Segundo bucle para imprimir los cambios
  for (int i=0;i<prod.size();i++) {
    
    System.out.println(" "+prod.get(i).getNombre());
  }
  //Bucle para eliminar todos los datos
  for (int i=0;i<prod.size();i++) {
    
    prod.remove(i);
  }

}
}