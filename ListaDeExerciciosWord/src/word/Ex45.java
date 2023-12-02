package word;

import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas = 5;
        int somaIdades = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.next();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("A média das idades é: " + mediaIdades);
    }
}

