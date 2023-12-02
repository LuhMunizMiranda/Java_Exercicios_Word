package word;

import java.util.Scanner;

public class Ex72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
            return;
        }

        System.out.println("Os divisores de " + numero + " são:");

        int divisor = 1;

        do {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        } while (divisor <= numero);
    }
}

