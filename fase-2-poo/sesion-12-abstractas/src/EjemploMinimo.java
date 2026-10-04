// La palabra abstract bloquea la creación directa de objetos de esta clase.
abstract class Personaje {
    String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto: no tiene cuerpo (no hay llaves {})
    // Solo define el "Que". Obliga por contrato a los hijos a definir el "Como"
    public abstract void atacar();

    // Un padre abstracto tambien puede tener metodos normales ya programados
    public void caminar() {
        System.out.println(this.nombre + " está caminando por el mapa...");
    }
}

//El hijo hereda, pero esta obligado a cumplir el contrato del padre.
class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre);
    }

    // Obligatorio: Si el hijo no implenta este metodo, el codigo no compila.

    @Override
    public void atacar() {
        System.out.println(this.nombre + " lanza una bola de fuego.");
    }
}

public class EjemploMinimo {
    public static void main(String[] args) {
        // Personaje p1 = new Personaje("Gandalf"); // ERROR: No se puede instanciar un objeto de una clase abstracta
        Personaje miMago = new Mago("Gandalf");

        miMago.caminar(); // Usa el metodo del padre
        miMago.atacar(); // Usa el metodo implementado obligatoriamente por el hijo
    }
}
