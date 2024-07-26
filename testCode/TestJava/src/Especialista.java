public class Especialista {
  private String area;
  private int exp_anos;

  public Especialista(String ar, int exp_a) {
    area = ar;
    exp_anos = exp_a;
  }

  public void imprimir_especial() {
    System.out.println("Sua area: " + area);
    System.out.println("Sua experiência: " + exp_anos);
  }
}
