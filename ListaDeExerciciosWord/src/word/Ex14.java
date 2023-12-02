package word;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();


        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A pessoa tem aproximadamente " + idadeEmDias + " dias de vida.");

        scanner.close();
    }
}
