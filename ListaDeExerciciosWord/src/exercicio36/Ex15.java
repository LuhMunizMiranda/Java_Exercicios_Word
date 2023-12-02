package exercicio36;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavraSecreta = "luiza";
        char[] palavraEscondida = new char[palavraSecreta.length()];
        boolean[] letraRevelada = new boolean[palavraSecreta.length()];
        int tentativasRestantes = 6;

        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraEscondida[i] = '_';
        }

        while (tentativasRestantes > 0) {
            System.out.println("Palavra: " + new String(palavraEscondida));

            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            boolean letraEncontrada = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra && !letraRevelada[i]) {
                    palavraEscondida[i] = letra;
                    letraRevelada[i] = true;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                tentativasRestantes--;
                System.out.println("Letra incorreta. Dica:A melhora aluna do Jailson. Tentativas restantes: " + tentativasRestantes);
            }

            if (new String(palavraEscondida).equals(palavraSecreta)) {
                System.out.println("Parabéns! Você adivinhou a palavra: " + palavraSecreta);
                break;
            }
        }

        if (tentativasRestantes == 0) {
            System.out.println("Você perdeu! A palavra correta era: " + palavraSecreta);
        }

        scanner.close();
    }
}
