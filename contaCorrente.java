package ListadeExercíciosVIIIPOO;

public class contaCorrente {
	private int numeroConta;
	private String nomeCorrentista;
	private double saldo;

	public contaCorrente(int numeroConta, String nomeCorrentista) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = 0.0;
	}

	public contaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}

	public void alterarNome(String novoNome) {
		this.nomeCorrentista = novoNome;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		if (valor <= saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public double getSaldo() {
		return saldo;
	}
}
