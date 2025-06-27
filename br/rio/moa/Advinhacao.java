package br.rio.moa;

// Jogo de Adivinhação: Crie um simples jogo em que o computador escolhe um número aleatório entre 1 e 100, e o usuário tenta adivinhar qual é. O programa deve informar se a adivinhação é muito alta, muito baixa ou correta.
public class Advinhacao {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int numeroSecreto = random.nextInt(100) + 1;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100:");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Muito alto! Tente novamente.");
            }
        }

        scanner.close();
    }
}
