public class Deck {
  private int indice;
  private Carta[] deck, mao;

  public Deck() {
    deck = new Carta[60];
    mao = new Carta[60];
    indice = 0;
  }

  public int getIndice() {
    return indice;
  }

  public void inserir(Carta c) {
    deck[indice] = c;
    indice++;
  }

  public void remover(Carta c) {
    for(int i = 0; i < indice; i++){
      if (deck[i] == c) {
        deck[i] = deck[indice-1];
        deck[indice-1] = null;
        System.out.println("Carta removida com sucesso!!");
        indice--;
      }
    }
  }

  public void trocarCarta(Carta c1, Carta c2) {
    for(int i = 0; i < indice; i++) {
      if (deck[i] == c1) {
        deck[i] = c2;
        System.out.println("Carta atualizada!!");
      }
    }
  }
  
  public void procurar(Carta c) {
    for(int i = 0; i< indice; i++) {
      if (deck[i] == c) {
        System.out.println("Carta encontrada!!");
      }
    }    
  }

  public void printAll() {
    for(int i = 0; i<indice;i++) {
      deck[i].imprimir();
      System.out.println("------------------------X");
    }
  }

  private int randomNum(int min, int max) {
    return (int)Math.floor(Math.random()*(max-min+1)+min);
  }

  public void iniciarGame() {
    for(int i = 0; i<6;i++) {
      int auxi = randomNum(0, indice-1);
      mao[i] = deck[auxi];
      deck[auxi] = deck[indice-1];
      deck[indice-1] = null;
      indice--;
    }

    for(int i = 0; i<6; i++) {
      mao[i].imprimir();
      System.out.println("----------------------------------X");
    }
  }
}
