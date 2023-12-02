package word;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em porcentagem): ");
        double taxaJurosMensal = scanner.nextDouble() / 100; // Convertendo para decimal

        double montante = 0;

        for (int i = 0; i < 12; i++) {

            montante = (montante + depositoMensal) * (1 + taxaJurosMensal);
        }

        System.out.println("O montante após 12 meses é: " + montante);

        scanner.close();
    }
}
