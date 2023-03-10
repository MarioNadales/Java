    import java.util.Scanner;
    public class EjercicioExamen2 {
	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("Este programa mostrará los n primeros números de Fibonacci");
    
    int n1 = 0;
    int n2 = 1;
    int acum = 0;
    
    System.out.print("Indique cuántos números desea que se muestren ");
    int n = s.nextInt();
    
    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        System.out.print(n1 + ", ");
      } else if (i == 2) {
        System.out.print(n2 + ", ");
      } else {
        System.out.print((n1 + n2) + ", ");
        acum = n2;
        n2 += n1;
        n1 = acum;
      }
    }
  }
}

