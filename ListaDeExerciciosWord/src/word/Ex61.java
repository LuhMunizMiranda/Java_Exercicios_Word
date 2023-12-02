package word;

public class Ex61 {
    public static void main(String[] args) {
        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");

        int contador = 0;
        int anterior = 0;
        int atual = 1;

        while (contador < 20) {
            System.out.print(anterior + " ");

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            contador++;
        }
    }
}

