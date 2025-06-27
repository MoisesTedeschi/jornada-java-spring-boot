package fundamentos.rio.moa;

// Média de Notas: Peça ao usuário para inserir 5 notas e calcule a média aritmética.
public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void calcularMedia(double[] notas) {
        if (notas.length != 5) {
            System.out.println("Por favor, insira exatamente 5 notas.");
            return;
        }
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        
        double media = soma / notas.length;
        System.out.println(nome + ", sua média final é: " + media);
    }

    public String getNome() {
        return nome;
    }
}

