package word;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o nome do mês
        System.out.print("Digite o nome do mês (em minúsculas): ");
        String nomeMes = scanner.nextLine();

        // Verifica a quantidade de dias com base no nome do mês
        int quantidadeDias = 0;

        switch (nomeMes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                quantidadeDias = 31;
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                quantidadeDias = 30;
                break;
            case "fevereiro":
                quantidadeDias = 28; // Considerando ano não bissexto
                break;
            default:
                System.out.println("Nome de mês inválido.");
                // Fecha o Scanner para evitar vazamentos de recursos
                scanner.close();
                return; // Encerra o programa se o mês for inválido
        }

        // Exibe a quantidade de dias do mês
        System.out.println("O mês de " + nomeMes + " possui " + quantidadeDias + " dias.");

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}