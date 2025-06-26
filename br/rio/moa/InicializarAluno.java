package br.rio.moa;

public class InicializarAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Maria", 22);

        aluno1.notafinal(10, 9.0);
        aluno2.notafinal(7.0, 6.5);

        System.out.println("Nome do aluno 1: " + aluno1.getNome());
    }
}
