package fundamentos.rio.moa;

// Calculadora Simples: Desenvolva uma calculadora que possa realizar operações básicas (adição, subtração, multiplicação e divisão) com dois números inteiros.
public class CalculadoraSimples {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        System.out.println("Soma: " + somar(a, b));
        System.out.println("Subtração: " + subtrair(a, b));
        System.out.println("Multiplicação: " + multiplicar(a, b));
        System.out.println("Divisão: " + dividir(a, b));

    }
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            return 0;
        } 
        return a / b;
    }
}
