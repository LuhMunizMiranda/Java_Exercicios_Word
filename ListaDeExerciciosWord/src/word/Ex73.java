package word;

import java.util.Scanner;

public class Ex73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 2) {
            System.out.println(numero + " não é um número primo.");
            return;
        }

        int divisor = 2;
        boolean ehPrimo = true;

        do {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break;
            }
            divisor++;
        } while (divisor <= Math.sqrt(numero));

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}

