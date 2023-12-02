package word;

import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até " + numero + " usando while:");

        int anterior = 0;
        int atual = 1;

        while (anterior <= numero) {
            System.out.print(anterior + " ");

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}

