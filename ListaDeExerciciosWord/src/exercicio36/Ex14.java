package exercicio36;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o limite da soma dos dígitos: ");
        int limite = scanner.nextInt();

        int soma = 0;
        int temp = numero;

        while (temp != 0 && soma <= limite) {
            soma += temp % 10;
            temp /= 10;
        }

        System.out.println("A soma dos dígitos de " + numero + " até o limite de " + limite + " é: " + soma);

        scanner.close();
    }
}
