// Clase Padre (Superclase)
class Entidad {
    String nombre;
    int salud;

    // Constructor

    public Entidad(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public void recibirDano(int cantidad){
        this.salud = this.salud - cantidad;
        System.out.println(this.nombre + " recibe " + cantidad + " de daño. Salud restante: " + this.salud);
    }
}

// Clase Hija (Subclase)
class Dragon extends Entidad {
    int poderFuego;

    public Dragon(String nombre, int salud, int poderFuego) {
        // 'super' llama obligatoriamente al constructor de la clase padre
        super(nombre, salud);
        this.poderFuego = poderFuego;
    }

    public void escupirFuego() {
        // El dragon puede usar 'this.nombre' porque lo heredo, aunque no este declarado
        System.out.println(this.nombre + " escupe fuego con poder de " + this.poderFuego);
    }
}
public class EjemploMinimo {
    public static void main(String[] args) {
        Dragon smug = new Dragon("Dragon", 1000, 50);
        Entidad orco = new Entidad("Orco", 500);

        smug.escupirFuego();
        smug.recibirDano(50);

        // orco.escupirFuego();
    }
}
