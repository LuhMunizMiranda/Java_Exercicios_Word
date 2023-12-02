package exercicio36;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da série Fibonacci: ");
        int quantidadeTermos = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Série Fibonacci:");

        for (int i = 0; i < quantidadeTermos; i++) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }
}
