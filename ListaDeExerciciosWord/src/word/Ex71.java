package word;

import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + " (até o décimo valor):");

        int contador = 1;

        do {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        } while (contador <= 10);
    }
}

