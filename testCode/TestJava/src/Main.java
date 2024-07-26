public class Main {
  public static void main(String[] args) {
    Laboratorio BD = new Laboratorio();
    Especialista e1 = new Especialista("T.I", 5);

    Pesquisador p1 = new Pesquisador(2, "Caio", e1);
    Pesquisador p2 = new Pesquisador(1, "Caio Ferreira", e1);
    Pesquisador p3 = new Pesquisador(8, "Caio Almeida", e1);
    BD.inserir(p1);
    BD.inserir(p2);
    BD.inserir(p3);
    BD.relatorio();

  }
}
