package word;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 5;
        int soma = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / quantidadeNumeros;

        System.out.println("A média aritmética dos números é: " + media);
    }
}

