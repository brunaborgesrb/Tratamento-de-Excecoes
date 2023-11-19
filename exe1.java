import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        try {
            System.out.print("Digite a posição (um número): ");
            int posicao = Integer.parseInt(scanner.nextLine());

            char letraNaPosicao = obterLetraNaPosicao(nome, posicao);
            System.out.println("A letra na posição " + posicao + " é: " + letraNaPosicao);

        } catch (NumberFormatException e) {
            System.out.println("Posição inválida. Informe um número válido.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição inválida. A posição informada está fora do comprimento do nome.");
        }
    }

    private static char obterLetraNaPosicao(String nome, int posicao) {
        if (posicao < 0 || posicao >= nome.length()) {
            throw new IndexOutOfBoundsException();
        }

        return nome.charAt(posicao);
    }
}
