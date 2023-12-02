package word;

import java.util.Scanner;

public class Ex03 {
    public static double calcularArea(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = calcularArea(base, altura);

        System.out.println("A área do triângulo com base " + base + " e altura " + altura + " é: " + area);

        scanner.close();
    }
}
