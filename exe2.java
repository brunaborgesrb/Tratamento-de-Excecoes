
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do ArrayList para armazenar as idades
        ArrayList<Integer> idades = new ArrayList<>();

        // Leitura das idades de 10 pessoas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            try {
                int idade = scanner.nextInt();
                idades.add(idade);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa o buffer do scanner
                i--; // Decrementa i para repetir a leitura da idade
            }
        }

        // Leitura do número para remover da lista
        System.out.print("Digite o número da posição a ser removida: ");
        try {
            int posicao = scanner.nextInt();
            removerDaLista(idades, posicao);
            System.out.println("Lista após a remoção: " + idades);

        } catch (InputMismatchException e) {
            System.out.println("Posição inválida. Por favor, digite um número.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição inválida. A posição informada está fora do tamanho da lista.");
        }
    }

    private static void removerDaLista(ArrayList<Integer> lista, int posicao) {
        if (posicao < 0 || posicao >= lista.size()) {
            throw new IndexOutOfBoundsException();
        }

        lista.remove(posicao);
    }
}


