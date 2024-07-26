public class Profissional extends Socio{
  private String empresa, profissao;

  public Profissional(String n, String m, double va, int i, String e, String p) {
    super(n, m, va, i);
    empresa = e;
    profissao = p;
  }

  public void imprimir() {
    System.out.println("Seu nome é: "+nome+"\nSua anuidade é de: " +valor_anuidade+"\nSua empresa tem nome: "+empresa+"\nSua profissão é: "+profissao);
  }
}
