package br.rio.moa;

public class ContadorRegressivo {
    public static void main(String[] args) {
        int cont = 5;

        while(cont >= 1) {
            System.out.println("Contagem regressiva: " + cont);
            cont--;
        }
    }
}
