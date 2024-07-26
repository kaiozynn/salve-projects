public class Pesquisador {
  private int codigo;
  private String nome;
  private Especialista especial;

  public Pesquisador(int code, String na, Especialista Ep) {
    codigo = code;
    nome = na;
    especial = Ep;
  }

  public void imprimir_pesq() {
    System.out.println("Seu codigo: " + codigo);
    System.out.println("Seu nome: " + nome);
    especial.imprimir_especial();
  }

  public int getCodigo() {
    return codigo;
  }
}
