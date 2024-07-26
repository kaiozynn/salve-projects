public class TesteBorracha extends Teste{
  public TesteBorracha(int id, String l, String dn_bn) {
    super(id, l, dn_bn);
    material = "Borracha";
  }

  public void printInfo() {
    System.out.println("O id do material é: " + id);
    System.out.println("O material é do tipo: " + material);
    System.out.println("O lote é: " + lote);
  }

  public void consultarTest() {
    System.out.println("O id do material é: " + id);
    System.out.println("O material é do tipo: " + material);
    System.out.println("O lote é: " + lote);
    System.out.println("Resultado abrasão: " + abrasao);
    System.out.println("Resultado dureza: " + dureza);
    System.out.println("Resultado alongamento: " + alongamento);
    System.out.println("Resultado rasgamento: " + rasgamento);
    System.out.println("Resultado densidade: " + densidade);
    System.out.println("Resultado modulo 300%: " + modulo300);
  }

  public void atualizarTest(int ab, int du, double al, double ra, double de, double mo) {
    abrasao = ab;
    dureza = du;
    alongamento = al;
    rasgamento = ra;
    densidade = de;
    modulo300 = mo;
  }
}
