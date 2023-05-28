package ListadeExercíciosVIIIPOO;

public class pessoaMain {
	public static void main(String[] args) {
		pessoa pessoa = new pessoa("João", 18, 70.0, 170.0);

		pessoa.envelhecer();
		System.out.println("Altura: " + pessoa.getAltura());

		pessoa.engordar(5.0);
		System.out.println("Peso: " + pessoa.getPeso());

		pessoa.emagrecer(3.0);
		System.out.println("Peso: " + pessoa.getPeso());

		pessoa.crescer(5.0);
		System.out.println("Altura: " + pessoa.getAltura());
	}
}
