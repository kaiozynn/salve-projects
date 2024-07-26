public class Estudante extends Socio{
  private String universidade, tipo;

  public Estudante(String n, String m, double va, int i, String u, String t) {
    super(n, m, va, i);
    universidade = u;
    tipo = t;
  }

  public void imprimir() {
    System.out.println("Seu nome é: " + nome+"\nSua matrícula é: "+matricula+"\nSua idade é: "+idade+"\nSua universidade é: "+universidade+"\nSua universidade é: " + tipo);
  }
}
