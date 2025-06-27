package br.rio.moa;

// Fibonacci: Crie um programa que gere a sequência de Fibonacci até o enésimo termo fornecido pelo usuário.
public class Fibonacci {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Informe o enésimo termo da sequência de Fibonacci:");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
