public class BancoDeDados {
  private Teste[] BD;
  private int indice;

  public BancoDeDados() {
    BD = new Teste[10];
    indice = 0;
  }

  public void inserir(Teste t) {
    BD[indice] = t;
    indice++;
  }

  public void remover(Teste t) {
    for(int i = 0; i < indice; i++) {
      if (BD[i] == t) {
        BD[i] = BD[indice-1];
        BD[indice-1] = null;
        indice--;
      }
    }
  }

  public void printAll() {
    for(int i = 0; i < indice; i++) {
      BD[i].consultarTest();
      System.out.println("-------------------------------X");
    }
  }


}
