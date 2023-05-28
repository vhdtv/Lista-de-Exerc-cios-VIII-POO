package ListadeExercíciosVIIIPOO;

public class bichinhoVirtual {
	private String nome;
	private int fome;
	private int saude;
	private int idade;

	public bichinhoVirtual(String nome) {
		this.nome = nome;
		this.fome = 0;
		this.saude = 100;
		this.idade = 0;
	}

	public void alterarNome(String novoNome) {
		this.nome = novoNome;
	}

	public void alterarFome(int novaFome) {
		this.fome = novaFome;
	}

	public void alterarSaude(int novaSaude) {
		this.saude = novaSaude;
	}

	public void alterarIdade(int novaIdade) {
		this.idade = novaIdade;
	}

	public String getNome() {
		return nome;
	}

	public int getFome() {
		return fome;
	}

	public int getSaude() {
		return saude;
	}

	public int getIdade() {
		return idade;
	}

	public String getHumor() {
		if (fome < 50 && saude >= 50) {
			return "Feliz";
		} else if (fome >= 50 && saude >= 50) {
			return "Com fome";
		} else if (fome < 50 && saude < 50) {
			return "Doente";
		} else {
			return "Triste";
		}
	}
}
