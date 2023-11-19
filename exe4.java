import java.util.InputMismatchException;
import java.util.Scanner;

public class exe4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int index = 0;

        try {
            System.out.println("Digite valores inteiros para preencher o vetor (0 para parar):");

            while (true) {
                System.out.print("Digite um valor: ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    break; // Interrompe o loop se o usuário digitar 0
                }

                if (index >= 10) {
                    throw new ArrayIndexOutOfBoundsException(); // Lança exceção se ultrapassar o tamanho do vetor
                }

                vetor[index++] = valor;
            }

            System.out.println("Valores no vetor:");
            for (int i = 0; i < index; i++) {
                System.out.println(vetor[i]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um valor inteiro.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Número máximo de elementos atingido. Os valores excedentes foram ignorados.");
        }
    }
}

