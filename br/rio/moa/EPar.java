package br.rio.moa;

// Par ou Ímpar: Crie um programa que peça ao usuário para inserir um número e determine se ele é par ou ímpar.
public class EPar {
    public static void main(String[] args) {
        System.out.println("Informe um número para verificar se é par ou ímpar:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}
