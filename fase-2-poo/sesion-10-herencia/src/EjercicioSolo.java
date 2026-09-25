class MiembroEquipo {
    protected String nombre;
    protected int edad;

    public MiembroEquipo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo base en la clase padre
    public void mostrarDatos() {
        System.out.print("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }
}

class Futbolista extends MiembroEquipo {
    protected int numeroCamiseta;

    public Futbolista(String nombre, int edad, int numeroCamiseta) {
        super(nombre, edad);
        this.numeroCamiseta = numeroCamiseta;
    }

    // Sobrescritura del método para el Futbolista
    @Override
    public void mostrarDatos() {
        System.out.print("Futbolista: ");
        super.mostrarDatos(); // Llama al print del padre
        System.out.println(", Número de Camiseta: " + this.numeroCamiseta); // Añade lo suyo
    }
}

class Entrenador extends MiembroEquipo {
    protected String esquemaFavorito;

    public Entrenador(String nombre, int edad, String esquemaFavorito) {
        super(nombre, edad);
        this.esquemaFavorito = esquemaFavorito;
    }

    // Sobrescritura del método para el Entrenador
    @Override
    public void mostrarDatos() {
        System.out.print("Entrenador: ");
        super.mostrarDatos(); // Llama al print del padre
        System.out.println(", Esquema Favorito: " + this.esquemaFavorito); // Añade lo suyo
    }
}

public class EjercicioSolo {
    public static void main(String[] args) {
        Futbolista jugador1 = new Futbolista("Marcelo Amaya", 22, 10);
        Entrenador entrenador1 = new Entrenador("Roberto Mosquera", 56, "4-3-3");

        // El main queda completamente limpio, delegando la responsabilidad a los objetos
        jugador1.mostrarDatos();
        entrenador1.mostrarDatos();
    }
}
