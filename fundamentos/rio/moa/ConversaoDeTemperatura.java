package fundamentos.rio.moa;

// Conversão de Temperatura: Crie um programa que converta uma temperatura de Celsius para Fahrenheit e vice-versa.
public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C é igual a " + fahrenheit + "°F");

        System.out.println("Informe a temperatura em Fahrenheit:");
        fahrenheit = scanner.nextDouble();
        celsius = fahrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F é igual a " + celsius + "°C");

        scanner.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
