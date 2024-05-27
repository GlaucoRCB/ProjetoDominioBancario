public class Main {

    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        Cliente ciclano = new Cliente();
        fulano.setNome(("fulano"));
        ciclano.setNome(("ciclano"));

        Conta cc = new ContaCorrente(fulano);
        Conta poupanca = new ContaPoupanca(ciclano);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        poupanca.sacar(50);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}