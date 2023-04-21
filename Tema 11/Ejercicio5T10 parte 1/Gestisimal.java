import java.util.Scanner;
import java.util.ArrayList;
public class Gestisimal {
  // N determina el tamaño del array
  static int N = 100;
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
  
  int opcion;
  int primeraLibre;
  int i;
  int stockIntroducido;
  double precioDeCompraIntroducido;
  double precioDeVentaIntroducido;
  String codigo;
  String codigoIntroducido = "";
  String descripcionIntroducida;
  String precioDeCompraIntroducidoString;
  String precioDeVentaIntroducidoString;
  String stockIntroducidoString;
  boolean existeCodigo;

  //Crea el arraylist de artículos
  ArrayList<Articulo> articulo = new ArrayList<Articulo>();
  // Crea todos los artículos que van en cada una de
  // las celdas del array
  for(i = 0; i < N; i++) {
  articulo.add(new Articulo());
  }
  // Menu
  do {
  System.out.println("G E S T I S I M A L");
  System.out.println("===================");
  System.out.println("1. Listado");
  System.out.println("2. Alta");
  System.out.println("3. Baja");
  System.out.println("4. Modificación");
  System.out.println("5. Entrada de mercancía");
  System.out.println("6. Salida de mercancía");
  System.out.println("7. Salir");
  System.out.print("Introduzca una opción: ");
  opcion = s.nextInt();
  switch (opcion) {
  /////////////////////////////////////////////////////////////////////////////
  // LISTADO //////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  case 1:
  System.out.println("LISTADO");
  System.out.println("=======");
  for(i = 0; i < N; i++) {
  if ((articulo.get(i)).getCodigo().equals("LIBRE")) {
  System.out.println(articulo.get(i));
  }
  }
  break;
  /////////////////////////////////////////////////////////////////////////////
  // ALTA /////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  case 2:
  System.out.println("NUEVO ARTÍCULO");
  System.out.println("==============");
  // Busca la primera posición libre del array
  primeraLibre = 0;
  codigo = (articulo.get(primeraLibre)).getCodigo();
  while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
  primeraLibre++;
  if (primeraLibre < N) {
  codigo = (articulo.get(primeraLibre)).getCodigo();
  }
  }
  if (primeraLibre == N) {
  System.out.println("Lo siento, a base de datos está llena.");
  } else {
  // Introducción de datos
  System.out.println("Por favor, introduzca los datos del artículo.");
  System.out.print("Código: ");
  // Comprueba que el código introducido no se repita
  existeCodigo = true;
  while (existeCodigo) {
  existeCodigo = false;
  codigoIntroducido = s.nextLine();
  
  for (i = 0; i < N; i++) {
  if (codigoIntroducido.equals((articulo.get(i)).getCodigo())) {
  existeCodigo = true;
  }
  }
  
  if (existeCodigo) {
  System.out.println("Ese código ya existe en la base de datos.");
  System.out.print("Introduzca otro código: ");
  }
  } while (existeCodigo)
  (articulo.get(primeraLibre)).setCodigo(codigoIntroducido);
  System.out.print("Descripcion: ");
  descripcionIntroducida = s.nextLine();
  (articulo.get(primeraLibre)).setDescripcion(descripcionIntroducida);
  System.out.print("Precio de compra: ");
  precioDeCompraIntroducido = s.nextDouble();
  (articulo.get(primeraLibre)).setPrecioDeCompra(precioDeCompraIntroducido);
  System.out.print("Precio de venta: ");
  precioDeVentaIntroducido = s.nextDouble();
  (articulo.get(primeraLibre)).setPrecioDeVenta(precioDeVentaIntroducido);
  System.out.print("Stock: ");
  stockIntroducido = s.nextInt();
  (articulo.get(primeraLibre)).setStock(stockIntroducido);
  }
  break;
  /////////////////////////////////////////////////////////////////////////////
  // BAJA /////////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  case 3:
  System.out.println("BAJA");
  System.out.println("====");
  System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
  codigoIntroducido = s.nextLine();
  i = -1;
  codigo = "";
  do {
  i++;
  if (i < N) {
  codigo = (articulo.get(i)).getCodigo();
  }
  } while (!(codigo.equals(codigoIntroducido)) && (i < N));
  if (i == N) {
  System.out.println("Lo siento, el código introducido no existe.");
  } else {
    (articulo.get(i)).setCodigo("LIBRE");
  System.out.println("articulo borrado.");
  }
  break;
  /////////////////////////////////////////////////////////////////////////////
  // MODIFICACIÓN /////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  case 4:
  System.out.println("MODIFICACIÓN");
  System.out.println("============");
  System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
  codigoIntroducido = s.nextLine();
  i = -1;
  do {
  i++;
  } while ((((articulo.get(i)).getCodigo()).equals(codigoIntroducido)));
  System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
  System.out.println("Código: " + (articulo.get(i)).getCodigo());
  System.out.print("Nuevo código: ");
  codigoIntroducido = s.nextLine();
  if (codigoIntroducido.equals("")) {
    (articulo.get(i)).setCodigo(codigoIntroducido);
  }
  System.out.println("Descripción: " + articulo.get(i).getDescripcion());
  System.out.print("Nueva descripción: ");
  descripcionIntroducida = s.nextLine();
  if (descripcionIntroducida.equals("")) {
    (articulo.get(i)).setDescripcion(descripcionIntroducida);
  }
  System.out.println("Precio de compra: " + articulo.get(i).getPrecioDeCompra());
  System.out.print("Nuevo precio de compra: ");
  precioDeCompraIntroducidoString = s.nextLine();
  if (precioDeCompraIntroducidoString.equals("")) {
    (articulo.get(i)).setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
  }
  System.out.println("Precio de venta: " + articulo.get(i).getPrecioDeVenta());
  System.out.print("Nuevo precio de venta: ");
  precioDeVentaIntroducidoString = s.nextLine();
  if (precioDeVentaIntroducidoString.equals("")) {
    (articulo.get(i)).setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
  }
  System.out.println("Stock: " + articulo.get(i).getStock());
  System.out.print("Nuevo stock: ");
  stockIntroducidoString = s.nextLine();
  if (stockIntroducidoString.equals("")) {
    (articulo.get(i)).setStock(Integer.parseInt(stockIntroducidoString));
  }
  break;
  /////////////////////////////////////////////////////////////////////////////
  // ENTRADA DE MERCANCÍA /////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  case 5:
  System.out.println("ENTRADA DE MERCANCÍA");
  System.out.println("====================");
  System.out.print("Por favor, introduzca el código del artículo: ");
  codigoIntroducido = s.nextLine();
  i = -1;
  codigo = "";
  do {
  i++;
  if (i < N) {
  codigo = (articulo.get(i)).getCodigo();
  }
  } while (!(codigo.equals(codigoIntroducido)) && (i < N));
  if (i == N) {
  System.out.println("Lo siento, el código introducido no existe.");
  } else {
  System.out.println("Entrada de mercancía del siguiente artículo: ");
  System.out.println(articulo.get(i));
  System.out.print("Introduzca el número de unidades que entran al almacén: ");

  stockIntroducidoString = s.nextLine();
  articulo.get(i).setStock(Integer.parseInt(stockIntroducidoString) + (articulo.get(i)).getStock());
  System.out.println("La mercancía ha entrado en el almacén.");
  }
  break;
  /////////////////////////////////////////////////////////////////////////////
  // SALIDA DE MERCANCÍA //////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////
  case 6:
  System.out.println("SALIDA DE MERCANCÍA");
  System.out.println("===================");
  System.out.print("Por favor, introduzca el código del artículo: ");
  codigoIntroducido = s.nextLine();
  i = -1;
  codigo = "";
  do {
  i++;
  if (i < N) {
  codigo = (articulo.get(i)).getCodigo();
  }
  } while ((codigo.equals(codigoIntroducido)) && (i < N));
  if (i == N) {
  System.out.println("Lo siento, el código introducido no existe.");
  } else {
  System.out.println("Salida de mercancía del siguiente artículo: ");
  System.out.println(articulo.get(i));
  System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
  stockIntroducido = s.nextInt();
  if ((articulo.get(i)).getStock() - stockIntroducido > 0) {
  (articulo.get(i)).setStock((articulo.get(i)).getStock() - stockIntroducido);
  System.out.println("La mercancía ha salido del almacén.");
  } else {
  System.out.println("Lo siento, no se pueden sacar tantas unidades.");
  }
  }
  break;

  }  
} while (opcion != 7);
}
}