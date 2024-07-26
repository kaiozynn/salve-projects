public abstract class Socio {
  protected String nome, matricula;
  protected double valor_anuidade;
  protected int idade;

  public Socio(String n, String m, double va, int i) {
    nome = n;
    matricula = m;
    valor_anuidade = va;
    idade = i;
  }

  public abstract void imprimir();

  public String getMatricula() {
    return matricula;
  }
}
