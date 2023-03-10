public class Pizza {
  
  private static int totalPedidas = 0;
  private static int totalServidas = 0;
  private String tamaño;
  private String tipo;
  private String estado;
  public Pizza(String tipo, String tamaño) {
  this.tipo = tipo;
  this.tamaño = tamaño;
  this.estado = "pedida";
  Pizza.totalPedidas++;
  }
  public String toString() {
  return "pizza " + this.tipo + " " + this.tamaño + ", " + this.estado;
  }
  public static int getTotalPedidas() {
  return Pizza.totalPedidas;
  }
  public static int getTotalServidas() {
  return Pizza.totalServidas;
  }
  public void sirve() {
  if (this.estado.equals("pedida")) {
  this.estado = "servida";
  Pizza.totalServidas++;
  } else {
  System.out.println("esa pizza ya se ha servido");
  }
}
}
