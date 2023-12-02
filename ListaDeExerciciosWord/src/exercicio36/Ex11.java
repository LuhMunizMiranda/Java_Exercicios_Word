package exercicio36;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas das provas:");

        double somaNotas = 0;
        int quantidadeProvas = 5;

        for (int i = 1; i <= quantidadeProvas; i++) {
            System.out.print("Prova " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / quantidadeProvas;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
