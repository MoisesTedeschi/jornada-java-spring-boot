package br.rio.moa;

// Fatorial: Crie um programa que calcule o fatorial de um número inteiro positivo fornecido pelo usuário.
public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Informe um número para calcular o fatorial:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            long resultado = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }

        scanner.close();
    }

    public static long calcularFatorial(int num) {
        long fatorial = 1;
        for (int i = 2; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
