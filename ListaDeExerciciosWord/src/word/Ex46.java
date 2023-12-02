package word;

public class Ex46 {
    public static void main(String[] args) {
        int quantidadeNumeros = 20;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");

        int anterior = 0;
        int atual = 1;

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print(anterior + " ");

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
