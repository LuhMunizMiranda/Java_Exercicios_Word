package word;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota (de 0 a 10): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (de 0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (de 0 a 10): ");
        double nota3 = scanner.nextDouble();

        double peso1 = 2;
        double peso2 = 3;
        double peso3 = 5;

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada é: " + mediaPonderada);

        scanner.close();
    }
}
