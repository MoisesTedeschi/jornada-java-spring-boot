package fundamentos.rio.moa;

// Contagem Regressiva: Escreva um programa que faça uma contagem regressiva de 10 a 0, imprimindo cada número.
public class ContadorRegressivo {
    public static void main(String[] args) {
        int cont = 10;

        while(cont >= 0) {
            System.out.println("Contagem regressiva: " + cont);
            cont--;
        }
    }
}
