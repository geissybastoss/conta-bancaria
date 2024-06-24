public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Geissy Bastos");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        Banco banco = new Banco("Meu Banco");
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(500);
        contaCorrente.transferir(250, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        banco.listarContas();
    }
}
