package word;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal;

        if (quantidade > 10) {
            double desconto = 0.1;
            valorTotal = preco * quantidade * (1 - desconto);
        } else {
            valorTotal = preco * quantidade;
        }

        System.out.println("O valor total a ser pago é: " + valorTotal);

        scanner.close();
    }
}
