public class AppSocio {
    public static void main(String[] args) throws Exception {
        Repositorio rp = new Repositorio();
        Estudante e1 = new Estudante("Caio", "20470", 1000, 19, "IFBA", "Pública" );
        Estudante e2 = new Estudante("Ailton", "56243", 5622, 22, "IFBA", "Pública");
        Profissional p1 = new Profissional("Caio", "00001", 1000, 19, "MonkeyCOMP", "Dono");

        rp.inserir(e1);
        rp.inserir(p1);
        rp.inserir(e2);

        rp.remover("20470");
        rp.imprimirAll();
        
    }
}
