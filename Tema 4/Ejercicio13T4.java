import java.util.Scanner;
public class Ejercicio13T4 {
	public static void main(String[] args) {
	  
	  Scanner s= new Scanner(System.in);
	  
	             System.out.println("Dame tres numeros y los ordeno");
                 int n1;
                 n1= s.nextInt(); 
                 int n2;
                 n2= s.nextInt(); 
                 int n3;
                 n3= s.nextInt(); 
                 
                  if (n1 > n2 && n2 > n3) {
                   
                    System.out.println("El primer numero es mayor= " +n1);
                    System.out.println("El segundo numero es el del medio= " +n2);
                    System.out.println("El tercer numero es menor= " +n3);
              
               }   else if (n2 > n1 && n1 > n3) {                                             
                      
                      System.out.println("El segundo numero es el mayor= " +n2);
                      System.out.println("El primer numero es el del medio= " +n1);
                      System.out.println("El tercer numero es menor= " +n3);
              
                 }  else if (n2 > n1 && n1 > n3) {
                        
                        System.out.println("El segundo numero es mayor= " +n2);
                        System.out.println("El primer numero es el del medio= " +n1);
                        System.out.println("El tercer numero es menor= " +n3);
              
                   }   else if (n2 > n3 && n3 > n1 ) {
                         
                          System.out.println("El segundo numero es mayor= " +n2);
                          System.out.println("El tercer numero es el del medio= " +n3);
                          System.out.println("El primer numero es menor= " +n1);
              
                    }    else if (n3 > n1 && n1 > n2) {
                           
                           System.out.println("El tercer numero es mayor= " +n3);
                           System.out.println("El primer numero es el del medio= " +n1);
                           System.out.println("El segundo numero es menor= " +n2);
              
                     }    else if (n3 > n2 && n2 > n1) {
                                                        
                             System.out.println("El segundo numero es mayor= " +n2);
                             System.out.println("El tercer numero es el del medio= " +n3);
                             System.out.println("El primer numero es menor= " +n1);
       }
	  
	}
}
