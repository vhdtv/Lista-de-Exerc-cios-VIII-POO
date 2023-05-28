package ListadeExercíciosVIIIPOO;

public class quadrado {
	private double tamanhoLado;

	public double getTamanhoLado() {
		return tamanhoLado;
	}

	public void setTamanhoLado(double tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}

	public void mudarValorLado(double tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}

	public double retornarValorLado() {
		return tamanhoLado;
	}

	public void calcularArea() {
		double area = tamanhoLado * 2;
		System.out.println("Área:" + area);
	}
}
