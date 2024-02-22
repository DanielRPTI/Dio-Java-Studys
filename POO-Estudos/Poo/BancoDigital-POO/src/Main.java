
public class Main {
	public static void main (String[] args) {
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100);
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.depositar(500);
		
		contaCorrente.transferir(50, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}
}
