package word;

import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int somaPares = 0;
        int i = 2;

        while (i <= numero) {
            somaPares += i;
            i += 2;
        }

        System.out.println("A soma dos números pares de 1 a " + numero + " é: " + somaPares);
    }
}

