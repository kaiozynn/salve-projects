public class AppLabo {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados();
        TesteEva te1 = new TesteEva(1, "BR30951-B", "2823");
        TesteBorracha tb1 = new TesteBorracha(2, "FILAEL3452", "6029");

        bd.inserir(tb1);
        bd.inserir(te1);
      }
}
