package ListadeExercíciosVIIIPOO;

public class bolaMain {
	public static void main(String[] args) {
		bola novaBola = new bola();
		novaBola.setCor("Rosa");
		novaBola.setCircunferencia(4.5);
		novaBola.setMaterial("Plastico");
		novaBola.mostrarCor();
		novaBola.trocaCor("Vermelho");
		novaBola.mostrarCor();

	}
}
