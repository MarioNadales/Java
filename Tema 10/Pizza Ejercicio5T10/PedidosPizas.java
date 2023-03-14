public class PedidosPizas {
  
  public static void main(String[] args) {
  
  Pizza p1 = new Pizza("margarita", "mediana");
  Pizza p2 = new Pizza("funghi", "familiar");
  p2.sirve();
  Pizza p3 = new Pizza("cuatro quesos", "mediana");
  Pizza p4 = new Pizza("Prosiuto", "grande");
  p4.sirve();
  System.out.println(p1);
  System.out.println(p2);
  System.out.println(p3);
  System.out.println(p4);
  p2.sirve();
  System.out.println("pedidas: " + Pizza.getTotalPedidas());
  System.out.println("servidas: " + Pizza.getTotalServidas());
  }
}
