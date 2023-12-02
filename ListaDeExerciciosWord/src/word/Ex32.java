package word;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        char conceito;

        if (nota >= 9.0 && nota <= 10.0) {
            conceito = 'A';
        } else if (nota >= 7.5 && nota < 9.0) {
            conceito = 'B';
        } else if (nota >= 6.0 && nota < 7.5) {
            conceito = 'C';
        } else if (nota >= 4.0 && nota < 6.0) {
            conceito = 'D';
        } else if (nota >= 0 && nota < 4.0) {
            conceito = 'E';
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
            scanner.close();
            return;
        }

        System.out.println("Conceito do aluno: " + conceito);

        scanner.close();
    }
}