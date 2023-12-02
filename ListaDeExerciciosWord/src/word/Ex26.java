package word;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigoProduto = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();

        double valorUnitario;

        switch (codigoProduto) {
            case 1:
                valorUnitario = 2.5;
                break;
            case 2:
                valorUnitario = 3.0;
                break;
            case 3:
                valorUnitario = 5.5;
                break;
            default:
                System.out.println("Código de produto inválido.");
                scanner.close();
                return;
        }

        double valorTotal = valorUnitario * quantidadeComprada;

        System.out.println("O valor total a ser pago é: R$ " + valorTotal);

        scanner.close();
    }
}
