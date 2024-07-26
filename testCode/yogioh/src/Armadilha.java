public class Armadilha extends Carta {
  private String propriedade;

  public Armadilha(String n, String p) {
    super(n);
    propriedade = p;
  }

  public void imprimir() {
    System.out.println("Carta do tipo: Armadilha"+"\nSeu nome é: "+nome+"\nSua descrição é: "+propriedade);
  }
}
