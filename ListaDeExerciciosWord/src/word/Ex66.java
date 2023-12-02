package word;

import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int quantidadePessoas = 0;

        System.out.println("Digite o nome e a idade (ou 'fim' para encerrar):");

        String nome = "";
        while (!nome.equalsIgnoreCase("fim")) {
            System.out.print("Nome: ");
            nome = scanner.next();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Idade de " + nome + ": ");
                int idade = scanner.nextInt();

                somaIdades += idade;
                quantidadePessoas++;
            }
        }

        if (quantidadePessoas > 0) {
            double mediaIdades = (double) somaIdades / quantidadePessoas;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}

