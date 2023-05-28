package ListadeExercíciosVIIIPOO;

public class bola {
	private String cor, material;
	private double circunferencia;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	public void trocaCor(String novaCor) {
		cor = novaCor;
	}

	public void mostrarCor() {
		System.out.println("A cor da bola é:" + cor);
	}
}
