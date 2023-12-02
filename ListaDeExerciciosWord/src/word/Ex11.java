package word;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número real: ");
        double numero3 = scanner.nextDouble();


        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}
