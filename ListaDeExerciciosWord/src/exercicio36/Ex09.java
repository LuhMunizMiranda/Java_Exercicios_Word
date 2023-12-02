package exercicio36;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a soma dos dígitos: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int temp = numero;

        while (temp != 0) {
            soma += temp % 10;
            temp /= 10;
        }

        System.out.println("A soma dos dígitos de " + numero + " é: " + soma);

        scanner.close();
    }
}
