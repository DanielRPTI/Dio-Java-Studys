
public class Main {
	public static void main (String[] args) {
		
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");
		daniel.setIdade(21);
		
		Conta contaCorrente = new ContaCorrente(daniel);
		contaCorrente.depositar(100);
		Conta contaPoupanca = new ContaPoupanca(daniel);
		contaPoupanca.depositar(500);
		
		contaCorrente.transferir(50, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}
}
