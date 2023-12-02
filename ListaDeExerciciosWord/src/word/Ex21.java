package word;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas no grupo: ");
        int numeroDePessoas = scanner.nextInt();

        int menoresDeIdade = 0;
        int maioresDeIdade = 0;

        for (int i = 1; i <= numeroDePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade < 18) {
                menoresDeIdade++;
            } else {
                maioresDeIdade++;
            }
        }

        System.out.println("No grupo, há " + menoresDeIdade + " pessoa(s) menor(es) de idade.");
        System.out.println("No grupo, há " + maioresDeIdade + " pessoa(s) maior(es) de idade.");

        scanner.close();
    }
}
