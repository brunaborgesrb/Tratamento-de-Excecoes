import java.util.InputMismatchException;
import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            double numerador = scanner.nextDouble();

            System.out.print("Digite o denominador: ");
            double denominador = scanner.nextDouble();

            double resultado = fazerDivisao(numerador, denominador);
            System.out.println("Resultado da divisão: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero. Não é possível dividir por zero.");
        }
    }

    private static double fazerDivisao(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException(); // Lança uma exceção se houver divisão por zero
        }

        return numerador / denominador;
    }
}
