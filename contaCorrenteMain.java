package ListadeExercíciosVIIIPOO;

public class contaCorrenteMain {
	public static void main(String[] args) {
		contaCorrente conta = new contaCorrente(12345, "João Silva");

		System.out.println("Número da conta: " + conta.getNumeroConta());
		System.out.println("Nome do correntista: " + conta.getNomeCorrentista());
		System.out.println("Saldo: " + conta.getSaldo());

		conta.alterarNome("João Oliveira");
		conta.deposito(100.0);
		conta.saque(50.0);

		System.out.println("Número da conta: " + conta.getNumeroConta());
		System.out.println("Nome do correntista: " + conta.getNomeCorrentista());
		System.out.println("Saldo: " + conta.getSaldo());
	}
}
