package word;

import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;
        int contador = 1;

        while (contador <= numero) {
            fatorial *= contador;
            contador++;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}

