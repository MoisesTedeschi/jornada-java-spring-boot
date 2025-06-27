/*
 * Casting em Java é o processo de converter uma referência de um tipo de objeto para outro tipo. 
 * Isso é especialmente comum em hierarquias de classes, onde você pode ter uma classe base e uma 
 * ou mais subclasses. O casting pode ser feito de duas maneiras:
 * - Upcasting: Converter uma referência de uma subclasse para a classe base (seguro e não requer casting).
 * - Downcasting: Converter uma referência de uma classe base para uma subclasse (requer casting e deve ser feito com cuidado).
 */

package fundamentos.rio.moa;

class Animal {
    public void fazerSom() {
        System.out.println("Animal faz um som genérico.");
    }
}

class Gato extends Animal {
    public void tipoAnimal() {
        System.out.println("Gato");
    }

    @Override
    public void fazerSom() {
        System.out.println("O gato mia.");
    }
}

class Cachorro extends Animal {
    public void tipoAnimal() {
        System.out.println("Cachorro");
    }

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}


public class Polimorfismo02 {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        animalGenerico.fazerSom();

        Animal gato = new Gato();
        ((Gato) gato).tipoAnimal();
        gato.fazerSom();

        Animal cachorro = new Cachorro();
        ((Cachorro) cachorro).tipoAnimal();
        cachorro.fazerSom();
    }
}
