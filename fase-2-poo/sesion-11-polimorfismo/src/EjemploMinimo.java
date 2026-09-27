class Animal {
    public void hacerSonido(){
        System.out.println("Sonido generico de animal...");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau!");
    }

    public void moverCola(){
        System.out.println("Moviendo la cola feliz...");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }
}

public class EjemploMinimo {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        Animal[] refugio = {miPerro, miGato, new Animal()};

        for (Animal animal : refugio) {
            animal.hacerSonido();
        }
    }
}
