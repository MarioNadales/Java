	
	public class ANDORNOT  {

		public static void main (String[] args)  {
			
				
			boolean a;
			boolean b;
			boolean c;
			boolean d;
			
			 a=true;
			 b=true;
			 c=false;
			 d=false;

				System.out.println("true y true = "+(a && a));
				System.out.println("true y false = "+(a && c));
				System.out.println("false y true = "+(d && a));
				System.out.println("false y false = "+(d && c));
				System.out.println("true O true = "+(a || a));
				System.out.println("true O false = "+(a || c));
				System.out.println("false O true = "+(d || a));
				System.out.println("false O false = "+(d || c));
				System.out.println("Not true = "+!a);
				System.out.println("Not false = "+ !c);
		}

	}
