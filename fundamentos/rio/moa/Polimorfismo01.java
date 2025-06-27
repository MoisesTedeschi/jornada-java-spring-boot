/*
 * Polimorfismo é outro pilar importante da POO e refere-se à capacidade de um objeto assumir muitas formas. 
 * Em Java, isso é geralmente implementado através de métodos que têm o mesmo nome, mas comportamentos 
 * diferentes, dependendo da classe que os implementa.
 * 
 * - Classe Base: A classe Animal possui um método fazerSom() que é uma implementação genérica.
 * 
 * - Classes Derivadas: As classes Cachorro e Gato estendem a classe Animal e sobrescrevem o método fazerSom() 
 * com suas implementações específicas.
 * 
 * - Array de Animais: No método main, criamos um array de Animal que pode conter objetos de diferentes 
 * subclasses (Cachorro e Gato).
 * 
 * - Chamada do Método: Quando chamamos fazerSom() para cada animal no array, o Java determina qual versão do 
 * método chamar em tempo de execução, com base no tipo real do objeto. Isso é o que se chama de polimorfismo — o 
 * mesmo método se comporta de maneira diferente dependendo da classe do objeto que o invoca.
 * 
 * Em resumo, o polimorfismo permite que você use o mesmo nome de método em diferentes classes, proporcionando 
 * flexibilidade e extensibilidade ao seu código.
 */

package fundamentos.rio.moa;

class Animal {
    public void fazerSom() {
        System.out.println("Animal faz um som genérico.");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia.");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

public class Polimorfismo01 {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        animalGenerico.fazerSom();

        Animal gato = new Gato();
        gato.fazerSom();

        Animal cachorro = new Cachorro();
        cachorro.fazerSom();

    }
}
