package word;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Os dígitos de " + numero + " são:");

        String numeroString = Integer.toString(numero);

        int indice = 0;

        while (indice < numeroString.length()) {
            char digito = numeroString.charAt(indice);
            System.out.println(digito);
            indice++;
        }
    }
}

