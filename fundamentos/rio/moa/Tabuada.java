package fundamentos.rio.moa;
import java.util.Scanner;

// Tabuada: Crie um programa que imprima a tabuada de um número fornecido pelo usuário.
public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Informe um número para calcular a tabuada:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Por favor, informe um número entre 1 e 10.");
            scanner.close();
            return;
        }
        
        imprimirTabuada(numero);

        scanner.close();
    }

    public static void imprimirTabuada( int num) {
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
