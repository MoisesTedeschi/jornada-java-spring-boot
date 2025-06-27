package br.rio.moa;

// Array de Números: Crie um programa que armazene 5 números em um array e imprima a soma e a média desses números.
public class NArray {
    public static void main(String[] args) {
        double[] numeros = new double[5];
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Informe 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }

        double media = soma / numeros.length;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
