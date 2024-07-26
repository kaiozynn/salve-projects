public class Repositorio {
  private Socio bd[];
  private int indice;

  public Repositorio() {
    bd = new Socio[10];
    indice = 0;
  }

  public void inserir(Socio s) {
    bd[indice] = s;
    indice++;
  }

  public void remover(String m) {
    for(int i = 0; i < indice; i++) {
      if(bd[i].matricula == m) {
        bd[i] = bd[indice-1];
        bd[indice-1] = null;
        indice--;
      }
    }
  }

  public void imprimirAll(){
    for(int i = 0; i< indice; i++) {
      bd[i].imprimir();
      System.out.println("---------------------------X");
    }
  }
}
