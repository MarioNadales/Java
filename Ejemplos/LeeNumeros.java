/*Programa que solicita 2 numeros y realiza un calculo
 * 
 * 
 * Autor= Mario Nadales Suarez
 */

public class LeeNumeros {
	public static void main(String[] args) {
    
      String linea;
     //se crea la variable "linea" definida como string 
      System.out.println("Por favor introduce un numero");
      linea= System.console().readLine();
      int numero1;
      numero1 = Integer.parseInt( linea );
      //Solicitamos un numero que se almacena en string y creamos otra variable para almacenarlo en esta.
      System.out.println("Introduce un segundo numero");
      linea= System.console().readLine();
      int numero2;
      numero2= Integer.parseInt( linea );
      //Solicitamos un segundo numero y lo volvemos a almacenar en una nueva variable int
      int total;
      total= (2 * numero1) + numero2;
      //Creamos una ultima variable llamada total para realizar el calculo y almacenar el resultado en esta
      System.out.println("El primer numero es= "+numero1);
      System.out.println("El segundo numero es= "+numero2);
      System.out.println("El doble del primer numero mas el segundo es= "+total);
      //Mostramos por pantalla los numeros que anterior mente hemos solicitado y el resultado de la variable total
   }
}
