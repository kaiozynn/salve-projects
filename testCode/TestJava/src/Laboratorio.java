public class Laboratorio {
  private Pesquisador[] Banco;
  private int indice;

  public Laboratorio() {
    Banco = new Pesquisador[3];
    indice = 0;
  }

  public void inserir(Pesquisador p) {
    Banco[indice] = p;
    indice++;
  }

  public void remover(Pesquisador rp) {
    for (int i = 0; i < indice; i++) {
      if(rp == Banco[i]) {
        Banco[i] = Banco[indice-1];
        Banco[indice-1] = null;
        indice--;
      }
    }
  }

  public void relatorio() {
    for(int i = 0; i < indice; i++) {
      if (Banco[i].getCodigo() % 2 == 0) {
        Banco[i].imprimir_pesq();
      }
    }
  }
}
