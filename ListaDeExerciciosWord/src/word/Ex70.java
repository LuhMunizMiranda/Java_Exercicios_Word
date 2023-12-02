package word;

import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 5;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite 5 números inteiros:");

        do {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        } while (contador < quantidadeNumeros);

        double media = (double) soma / quantidadeNumeros;

        System.out.println("A média aritmética dos números é: " + media);
    }
}

