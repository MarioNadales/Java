import java.util.Scanner;
public class Repaso1 {
  public static void main (String []Args) {
    
    System.out.println("Cual es el tamaño que desea de array");
    Scanner s=new Scanner(System.in);
    int f;
    f=s.nextInt();
    
    int aux=f;
    
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    
    int [] n= new int [f];
    int [] p= new int [f]; 
    
    for (int i=0; i<f; i++) {
	  
	  n[i]=(int)(Math.random()*21+30);
		
		//if (min>n[i]){
			//min=n[i];
		 //}
		if (max<n[i]){
			max=n[i];
		  }
		if (n[i]%2==0) {
		  p[aux-1]=n[i];
		  aux--;
			}  
		System.out.print(n[i]+" ");
	}System.out.println();
	for (int i=0; i<f; i++) {
	  
	  
	  
	  //if (n[i]==max) {
	    //System.out.print("**"+n[i]+"** ");
		  //}else {System.out.print(n[i]+" ");}
		 
	 // if (n[i]==min) {
	    //System.out.print("**"+n[i]+"** ");
		 // }else{System.out.print(n[i]+" ");}
		}
		System.out.println("Pares");
	for (int i=0; i<f; i++) {
	  
	  System.out.print(p[i]+" ");
	  
		}
	

}
}

