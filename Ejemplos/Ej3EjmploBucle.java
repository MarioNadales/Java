/* Programa que muestra por pantalla la suma y el producto de los primeros 10 numeros
 * 
 * Autor= Mario Nadales Suarez
 */
public class Ej3EjmploBucle {
	public static void main(String[] args) {
	  
	  int cont;
	  cont=0;
	  
	  int sum;
	  sum=0;
	  
	  int prod;
	  prod=0;
	  
	  int cont1;
	  cont1=1;
	  
		
	  for (int num=1; num<=10; num++) {
		
		
		cont=cont+num;
		
		sum=cont;
		
		cont1=cont1*num;
		
		prod=cont1;
		
		
	}
			System.out.println(sum);
			System.out.println(prod);
	}
}
