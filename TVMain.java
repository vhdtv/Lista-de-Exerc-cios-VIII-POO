package ListadeExercíciosVIIIPOO;

import java.util.Scanner;

public class TVMain {
    public static void main(String[] args) {
        TV tv = new TV();
        Scanner scanner = new Scanner(System.in);

        System.out.println("TV ligada.");
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());

        boolean ligado = true;

        while (ligado) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Alterar canal");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("0 - Desligar TV");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o número do canal: ");
                    int novoCanal = scanner.nextInt();
                    tv.alterarCanal(novoCanal);
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 0:
                    ligado = false;
                    System.out.println("TV desligada.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}

