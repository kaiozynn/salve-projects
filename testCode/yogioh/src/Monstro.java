public class Monstro extends Carta{
  private int level_star;
  private String efeito, raca, atributo;

  public Monstro(String n, String e, String r, String a, int ls) {
    super(n);
    level_star = ls;
    efeito = e;
    raca = r;
    atributo = a;
  }

  public void imprimir() {
    System.out.println("Seu nome é: "+nome+"\nSeu nível de estrelas é: "+level_star+"\nSeu efeito é: "+efeito+"\nSua raça é: "+raca+"\nSeu atributo é: "+atributo);
  }
}
