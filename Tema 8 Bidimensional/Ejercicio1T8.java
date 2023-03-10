public class Ejercicio1T8 {
	
  public static void main (String[] args) {
    
    int [][] a= new int [3][6];
    
    a[0][0]=0;
    a[0][1]=30;
    a[1][0]=75;
    a[0][2]=2;
    a[2][2]=-2;
    a[1][4]=0;
    a[0][5]=5;
    a[2][5]=11;
    a[2][3]=9;
    
    int fila;
    int columna;
    
    for (fila=0; fila<3; fila++){
    
      
    
    for(columna = 0; columna < 6; columna++) {
		
	  System.out.printf("%10d ", a[fila][columna]);
	  
      }
      System.out.println("");
    }
  }
}
	  
