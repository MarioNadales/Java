/*
* El programa calcula y incluye el iva en una factura de 15 euros 
*
* Autor= Mario Nadales Suarez
*/
  public class Ejercicio6T2 {
    public static void main(String[] args) {
	  
	  int fact;
	  fact= 15;
	  
	  double ivaNum;
	  ivaNum= 0.21;
	  
	  double iva;
	  iva=fact * ivaNum;
	  
	  double total;
	  total= iva + fact;
	  
	  System.out.println("La factura con el iva cuesta= "+total);
	}
}
