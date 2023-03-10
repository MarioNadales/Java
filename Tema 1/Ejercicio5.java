 /*El programa muestra por pantalla nuestro horario pero cada asignatura con un color distinto 
  * 
  *Autor: Mario Nadales Suarez*/	
 	public class Ejercicio5  {	
	  public static void main (String[] args)  {
	  	System.out.println("┌──────────┬───────────┬───────────────┬───────────┬───────────┐");	
		System.out.println("│Lunes     │Martes     │Miercoles      │Jueves     │Viernes    │");
		System.out.println("├──────────┼───────────┼───────────────┼───────────┼───────────┤");
		System.out.println("│\033[31m FOL \033[39;49m     │\033[34m BD \033[39;49m       │\033[34m BD \033[39;49m           │\033[94m Sist inf \033[39;49m │\033[93m LM \033[39;49m       │");
		System.out.println("├──────────┼───────────┼───────────────┼───────────┼───────────┤");
		System.out.println("│\033[33m FOL \033[39;49m     │\033[34m BD \033[39;49m       │\033[34m ED \033[39;49m           │\033[94m Sist inf \033[39;49m │\033[93m LM \033[39;49m       │");
		System.out.println("├──────────┼───────────┼───────────────┼───────────┼───────────┤");
		System.out.println("│\033[31m FOL \033[39;49m     │\033[92m Prog \033[39;49m     │\033[34m BD \033[39;49m           │\033[92m Prog \033[39;49m     │\033[92m Prog \033[39;49m     │");
		System.out.println("├──────────┼───────────┼───────────────┼───────────┼───────────┤");
		System.out.println("│\033[35m ED \033[39;49m      │\033[92m Prog \033[39;49m     │\033[34m ED \033[39;49m           │\033[92m Prog \033[39;49m     │\033[92m Prog \033[39;49m     │");
		System.out.println("├──────────┼───────────┼───────────────┼───────────┼───────────┤");
		System.out.println("│\033[94m Sist inf \033[39;49m│\033[93m LM \033[39;49m       │\033[35m ED \033[39;49m           │\033[92m Prog \033[39;49m     │\033[94m Sist inf \033[39;49m │");
		System.out.println("├──────────┼───────────┼───────────────┼───────────┼───────────┤");
		System.out.println("│\033[94m Sist inf \033[39;49m│\033[93m LM \033[39;49m       │\033[35m ED \033[39;49m           │\033[92m Prog \033[39;49m     │\033[94m Sist inf \033[39;49m │");
		System.out.println("└──────────┴───────────┴───────────────┴───────────┴───────────┘");
	 }
}
