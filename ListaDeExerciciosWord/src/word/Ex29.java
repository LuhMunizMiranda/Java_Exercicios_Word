package word;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        double notaAluno = scanner.nextDouble();

        if (notaAluno >= 7) {
            System.out.println("O aluno " + nomeAluno + " está aprovado.");
        } else {
            System.out.println("O aluno " + nomeAluno + " está em recuperação.");
        }

        scanner.close();
    }
}