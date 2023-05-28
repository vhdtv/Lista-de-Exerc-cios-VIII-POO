package ListadeExercíciosVIIIPOO;

public class bichinhoVirtualMain {
	public static void main(String[] args) {
		bichinhoVirtual bichinho = new bichinhoVirtual("Tama");

		System.out.println("Nome: " + bichinho.getNome());
		System.out.println("Fome: " + bichinho.getFome());
		System.out.println("Saúde: " + bichinho.getSaude());
		System.out.println("Idade: " + bichinho.getIdade());
		System.out.println("Humor: " + bichinho.getHumor());

		bichinho.alterarNome("Tama Jr.");
		bichinho.alterarFome(60);
		bichinho.alterarSaude(30);
		bichinho.alterarIdade(1);

		System.out.println("Nome: " + bichinho.getNome());
		System.out.println("Fome: " + bichinho.getFome());
		System.out.println("Saúde: " + bichinho.getSaude());
		System.out.println("Idade: " + bichinho.getIdade());
		System.out.println("Humor: " + bichinho.getHumor());
	}
}
