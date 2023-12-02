package word;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int maiorNumero;

        if (numero1 > numero2) {
            maiorNumero = numero1;
        } else {
            maiorNumero = numero2;
        }

        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}
