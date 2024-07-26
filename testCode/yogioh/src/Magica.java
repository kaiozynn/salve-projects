public class Magica extends Carta{
  private String tipo;

  public Magica(String n, String t) {
    super(n);
    tipo = t;
  }

  public void imprimir() {
    System.out.println("Nome da carta: "+nome+"\nDescrição da carta: "+tipo);
  }
}
