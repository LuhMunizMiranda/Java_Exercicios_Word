package word;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de faltas do aluno: ");
        int numeroDeFaltas = scanner.nextInt();

        if (numeroDeFaltas > 15) {
            System.out.println("Aluno reprovado por falta.");
        } else {
            System.out.println("Aluno aprovado.");
        }

        scanner.close();
    }
}

