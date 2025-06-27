package br.rio.moa;

// Média de Notas: Peça ao usuário para inserir 5 notas e calcule a média aritmética.
public class InicializarAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");

        double[] notas1 = {7.0, 8.5, 9.0, 6.5, 8.0};
        double[] notas2 = {6.0, 7.5, 8.0, 5.5, 7.0};

        aluno1.calcularMedia(notas1);
        aluno2.calcularMedia(notas2);
    }
}


