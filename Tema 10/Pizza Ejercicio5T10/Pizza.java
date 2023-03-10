public class Pizza {
  
  private static String Estado;
  private static String Tamaño;
  private static String Tipo;
  private static int TotalPedidas;
  private static int TotalServidas;

  public int getTotalPedidas() {
    return Pizza.TotalPedidas;
  }
  public void sirve() {
    TotalServidas+=1;
  }
  public int getTotalServidas(){
    return Pizza.TotalServidas;
  }
}
