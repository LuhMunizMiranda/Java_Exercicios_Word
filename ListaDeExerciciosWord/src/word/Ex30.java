package word;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int quantidadeMaca = scanner.nextInt();

        double precoUnitario;

        if (quantidadeMaca < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.40;
        }

        double valorTotal = quantidadeMaca * precoUnitario;

        System.out.println("O valor total a ser pago é: R$ " + valorTotal);

        scanner.close();
    }
}
