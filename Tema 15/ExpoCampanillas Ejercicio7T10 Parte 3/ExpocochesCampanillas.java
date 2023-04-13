import java.util.Scanner;
public class ExpocochesCampanillas {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  Zona principal = new Zona(1000);
  Zona compraVenta = new Zona(200);
  Zona vip = new Zona(25);
  String opcion;
  int opcionNum=0;
  String opcion2;
  int n = 0;
  do {
  System.out.println("EXPOCOCHES CAMPANILLAS");
  System.out.println("1. Mostrar número de entradas libres");
  System.out.println("2. Vender entradas");
  System.out.println("3. Salir");
  System.out.println("Elige una opción: ");
  opcion = s.nextLine();
  // En esta variante el hacemos una llamada al objeto e que contiene los errores y los muestro por pantalla
  try {
    opcionNum=Integer.parseInt(opcion);
  }catch (Exception e) {
    System.out.println("Exception "+ e.getClass());
    System.out.println("Error "+ e.getMessage());
    
  }
  if (opcionNum == 1) {
  System.out.println("En la zona principal hay " + principal.getEntradasPorVender());
  System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
  System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
  }
  if (opcionNum == 2) {
  System.out.println("1. Principal");
  System.out.println("2. Compra-venta");
  System.out.println("3. Vip");
  System.out.print("Elige la zona para la que quieres comprar las entradas: ");
  // En esta variante el hacemos una llamada al objeto e que contiene los errores y los muestro por pantalla
  do {
    opcion2 = s.nextLine();
    try {
      opcionNum=Integer.parseInt(opcion2);
    }catch (Exception e) {
      System.out.println("Exception "+ e.getClass());
      System.out.println("Error "+ e.getMessage());
      opcionNum=5;
    }
} while (opcionNum==5);
  System.out.print("¿Cuántas entradas quieres? ");
  n = Integer.parseInt(System.console().readLine());
  switch (opcionNum) {
  case 1:
  principal.vender(n);
  break;
  case 2:
  compraVenta.vender(n);
  break;
  case 3:
  vip.vender(n);
  break;
  default:
  }
  
}
  } while (opcionNum<3); 
}
}

