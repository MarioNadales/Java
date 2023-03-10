public class Ejercicio4T6 {
	public static void main(String[] args) {
	  
	  for(int num=320; num>=280; num-=20) {
		  
		System.out.println("\033[31m"+num);
	}
	  
	  	  for(int num=280; num>=220; num-=20) {
		  
		System.out.println("\033[33m"+num);
	}
		  for(int num=220; num>=160; num-=20) {
		  
		System.out.println("\033[31m"+num+"\033[37m");
	}
	}
}
