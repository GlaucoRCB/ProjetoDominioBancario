public class Main {

    public static void main(String[] args) {
        Cliente glauco = new Cliente();
        glauco.setNome(("glauco"));

        Conta cc = new ContaCorrente(glauco);
        Conta poupanca = new ContaPoupanca(glauco);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}