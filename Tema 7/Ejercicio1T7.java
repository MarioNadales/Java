/*Genera 3 numeros de 3 tiradas de dados
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ejercicio1T7 {
  public static void main (String[] args) {
	
	  int dado;
	  dado=0;
	  
	for (int i=1; i<=3; i++) {
	  
	  dado=(int)(Math.random()*6)+1;
	  System.out.println("Tirada "+i+"= "+dado);
    
      }
	}
}

