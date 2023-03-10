/* Programa que muestra por pantalla la suma de los pares y la suma de los impares entre 100 y 200
 * 
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ej4EjmploBucle {
	public static void main(String[] args) {
		
	  int contP;
	  contP=0;
	
	  int sumaP;
	  sumaP=0;
	  
	  int contI;
	  contI=0;
	  
	  int sumaI;
	  sumaI=0;
	  
	  for (int numP=100; numP<=200; numP=numP+2) {
		
		contP=contP+numP;
		
		sumaP=contP;
	    
		}
	    System.out.println(sumaP);
			  
	  for (int numI=101; numI<=199; numI=numI+2) {
		
		contI=contI+numI;
		
		sumaI=contI;
	}
	    System.out.println(sumaI);
	}
}
