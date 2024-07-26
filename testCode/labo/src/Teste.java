public abstract class Teste {
  protected String lote, material, dn_bn;
  protected boolean resultado;
  protected int abrasao, dureza, id;
  protected double alongamento, rasgamento, densidade, modulo300;
  
  public Teste(int id, String l, String dn_bn) {
    this.id = id;
    this.dn_bn = dn_bn;
    lote = l;
  }

  public int getId() {
    return id;
  }

  public abstract void consultarTest();

}
