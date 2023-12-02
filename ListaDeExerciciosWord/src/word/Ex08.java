package word;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Troca os valores
        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        System.out.println("Depois da troca, o primeiro número é: " + numero1);
        System.out.println("Depois da troca, o segundo número é: " + numero2);

        scanner.close();
    }
}
