import java.util.Scanner;
public class pruebaVehiculo {
  public static void main(String[] args) {
    
    Scanner s= new Scanner(System.in);
    
    
    System.out.println("Cual es el numero de piñones de tu bicicleta ");
    int piñones=s.nextInt();
    System.out.println("Y cual es la cilindrada de tu coche ");
    int cilin=s.nextInt();

      String opcion;
      int opcionNum = 0;

    int km=0;
    
    Bicicleta bici = new Bicicleta(piñones);
    Coche coche = new Coche(cilin);
    
    while (opcionNum != 11) {
    System.out.println("1. Mostrar piñones");
    System.out.println("2. Mostrar cilindrada");
    System.out.println("3. Desplazarse en bici");
    System.out.println("4. Hacer el caballito con la bicicleta");
    System.out.println("5. Desplazarse en coche");
    System.out.println("6. Quemar rueda con el coche");
    System.out.println("7. Ver kilometros en bicicleta");
    System.out.println("8. Ver kilometros en coche");
    System.out.println("9. Ver kilometros totales");
    System.out.println("10. Desplazarte en coche contando kilometros en bici tambien");
    System.out.println("11. Salir");
    System.out.println("Elige una opción (1-10): ");
    
    opcion =s.nextLine();
// Con la funcion isnumeric comprobamos que el numero introducido sea un numero entero
    if (isNumeric(opcion)) {
    opcionNum=Integer.parseInt(opcion);
    }else {
      opcionNum=19;
    }
    
    switch (opcionNum) {
    case 1:
    System.out.print("Los piñones de la bici son: "+piñones);
    
    break;
    case 2:
    System.out.print("La cilindrada del coche es: "+cilin);

    break;
    case 3:
    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
    km =s.nextInt();
    bici.recorre(km);
    break;
    
    case 4:
    bici.cab();
    break;
    
    case 5:
    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
    km = s.nextInt();
    coche.recorre(km);
    break;
    
    case 6:
    coche.quemaRueda();
    break;
    
    case 7:
    System.out.println("La bicicleta lleva recorridos ");
    System.out.println(bici.getKilometrosRecorridos() + " Km");
    break;
    
    case 8:
    System.out.println("El coche lleva recorridos ");
    System.out.println(coche.getKilometrosRecorridos() + " Km");
    break;
    
    case 9:
    System.out.println("Los vehículos llevan recorridos ");
    System.out.println(Vehiculo.getKilometrosTotales() + " Km");
    break;
    
    case 10:
    System.out.print("¿Cuántos kilómetros quieres recorrer en coche y añadir en bici? ");
    km = s.nextInt();
    coche.recorre(km);
    bici.recorre(km);
    default:System.out.print("Has introducido una opcion no valida intentelo de nuevo");
    }
    }
    }private static boolean isNumeric(String str){
      return str != null && str.matches("[0-9.]+");}
}


