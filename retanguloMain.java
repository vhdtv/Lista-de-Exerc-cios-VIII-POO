package ListadeExercíciosVIIIPOO;

import java.util.Scanner;

public class retanguloMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a medida do comprimento do local: ");
		double comprimento = scanner.nextDouble();

		System.out.print("Informe a medida da largura do local: ");
		double largura = scanner.nextDouble();

		retangulo local = new retangulo(comprimento, largura);

		double area = local.calcularArea();
		double perimetro = local.calcularPerimetro();

		double quantidadePisos = area / 0.25;
		double quantidadeRodapes = perimetro / 0.10;

		System.out.println("Quantidade de pisos necessários: " + quantidadePisos);
		System.out.println("Quantidade de rodapés necessários: " + quantidadeRodapes);

		scanner.close();
	}
}
