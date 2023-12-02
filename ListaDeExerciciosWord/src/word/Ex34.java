package word;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite o turno do aluno (M para Matutino, V para Vespertino): ");
        char turnoAluno = scanner.next().charAt(0);

        String saudacao;

        if (turnoAluno == 'M' || turnoAluno == 'm') {
            saudacao = "Bom dia, " + nomeAluno + "!";
        } else if (turnoAluno == 'V' || turnoAluno == 'v') {
            saudacao = "Boa tarde, " + nomeAluno + "!";
        } else {
            System.out.println("Turno inválido. Use M para Matutino ou V para Vespertino.");
            scanner.close();
            return;
        }

        System.out.println(saudacao);

        scanner.close();
    }
}
