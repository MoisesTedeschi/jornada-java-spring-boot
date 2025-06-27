package fundamentos.rio.moa;

// Contagem de Vogais: Crie um programa que conte o número de vogais em uma frase fornecida pelo usuário.
public class ContagemDeVogais {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Informe uma frase:");
        String frase = scanner.nextLine();

        int contagem = contarVogais(frase);
        System.out.println("Número de vogais na frase: " + contagem);

        scanner.close();
    }

    public static int contarVogais(String str) {
        int contador = 0;
        String vogais = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vogais.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
}
