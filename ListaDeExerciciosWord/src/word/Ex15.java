package word;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();


        double aumento = 0.15 * salario;


        double novoSalario = salario + aumento;

        System.out.println("O novo salário com aumento de 15% é: " + novoSalario);

        scanner.close();
    }
}
