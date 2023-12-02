package word;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        exibirDigitosSeparadamente(numero);
    }

    private static void exibirDigitosSeparadamente(int numero) {
        System.out.println("Os dígitos de " + numero + " são:");

        String numeroString = Integer.toString(numero);

        for (int i = 0; i < numeroString.length(); i++) {
            char digito = numeroString.charAt(i);
            System.out.println(digito);
        }
    }
}

