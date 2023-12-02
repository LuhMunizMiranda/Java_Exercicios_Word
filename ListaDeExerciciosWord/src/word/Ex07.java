package word;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        double comissao = 0.05 * salarioBase;

        double salarioLiquido = salarioBase + comissao;

        System.out.println("O salário líquido do funcionário é: " + salarioLiquido);

        scanner.close();
    }
}
