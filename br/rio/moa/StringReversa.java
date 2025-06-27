package br.rio.moa;

// String Reversa: Escreva um programa que inverta uma string fornecida pelo usuário.
public class StringReversa {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Informe uma string para inverter:");
        String input = scanner.nextLine();

        String reversed = reverterString(input);
        System.out.println("String invertida: " + reversed);

        scanner.close();
    }

    public static String reverterString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
