package exercicio36;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listaDeCompras = new ArrayList<>();

        System.out.println("Crie a sua lista de compras. Digite 'fim' para encerrar.");

        while (true) {
            System.out.print("Item: ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("fim")) {
                break;
            }

            listaDeCompras.add(item);
        }

        System.out.println("\nLista de Compras:");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        scanner.close();
    }
}
