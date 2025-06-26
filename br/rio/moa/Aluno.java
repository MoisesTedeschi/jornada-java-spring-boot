package br.rio.moa;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void notafinal(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        System.out.println("Média final do aluno " + nome + ": " + media);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}


