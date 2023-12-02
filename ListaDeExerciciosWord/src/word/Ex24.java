package word;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira três números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        // Ordena os números em ordem crescente
        int temp;

        // Verifica e troca a ordem dos números
        if (numero1 > numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero2 > numero3) {
            temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }

        if (numero1 > numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        // Exibe os números em ordem crescente
        System.out.println("Números em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}