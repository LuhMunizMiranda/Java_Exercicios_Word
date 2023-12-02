package word;

import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, digite um número inteiro não negativo.");
            return;
        }

        long fatorial = 1;
        int contador = 1;

        do {
            fatorial *= contador;
            contador++;
        } while (contador <= numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}

