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
