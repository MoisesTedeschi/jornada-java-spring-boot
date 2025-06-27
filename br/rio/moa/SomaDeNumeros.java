package br.rio.moa;

// Soma de Números: Desenvolva um programa que some todos os números de 1 a N, onde N é fornecido pelo usuário.
public class SomaDeNumeros {
    public static void main(String[] args) {
        System.out.println("Informe um número para calcular a soma dos números de 1 a N:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numero = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 a " + numero + " é: " + soma);
        scanner.close();
    }
}
