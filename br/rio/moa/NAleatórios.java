package br.rio.moa;

// Números Aleatórios: Gere e exiba 10 números aleatórios entre 1 e 100.
public class NAleatórios {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        System.out.println("Números aleatórios gerados:");
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(100) + 1;
            System.out.println(numero);
        }
    }
}
