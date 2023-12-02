package word;

import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas = 5;
        int somaIdades = 0;
        int contador = 0;

        System.out.println("Digite o nome e a idade de 5 pessoas:");

        while (contador < quantidadePessoas) {
            System.out.print("Nome da pessoa " + (contador + 1) + ": ");
            String nome = scanner.next();

            System.out.print("Idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            contador++;
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("A média das idades é: " + mediaIdades);
    }
}

