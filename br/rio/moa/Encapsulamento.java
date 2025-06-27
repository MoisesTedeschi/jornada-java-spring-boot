/* 
Encapsulamento é um dos pilares da programação orientada a objetos (POO) e se refere à prática de 
restringir o acesso a certas partes de um objeto e controlar como os dados são manipulados. Isso é 
feito geralmente através do uso de modificadores de acesso (como private, protected, e public) e 
métodos getter e setter.

- Atributos Privados: Os atributos titular e saldo são declarados como private, o que significa que 
não podem ser acessados diretamente de fora da classe ContaBancaria.

- Métodos Públicos: A classe fornece métodos públicos (getTitular, getSaldo, depositar, sacar) que 
permitem que o usuário interaja com os dados de forma controlada. Isso garante que o saldo não possa 
ser modificado diretamente, apenas através dos métodos definidos.

- Validação: Nos métodos depositar e sacar, há validações para garantir que os valores sejam válidos 
antes de alterar o saldo. Isso ajuda a proteger a integridade dos dados.

Resumindo, o encapsulamento ajuda a proteger os dados e a garantir que eles sejam manipulados de forma controlada.
*/

package br.rio.moa;

class ContaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método getter para obter o titular
    public String getTitular() {
        return titular;
    }

    // Método getter para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }
}

public class Encapsulamento {
    public static void main(String[] args) {
        // Criando uma nova conta bancária
        ContaBancaria conta = new ContaBancaria("João", 1000.0);

        // Usando os métodos públicos para interagir com a conta
        conta.depositar(500);
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.sacar(200);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
