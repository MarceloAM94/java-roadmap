class MiembroEquipo{
    protected String nombre;
    protected int edad;

    public MiembroEquipo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

class Futbolista extends MiembroEquipo {
    protected int numeroCamiseta;

    public Futbolista(String nombre, int edad, int numeroCamiseta) {
        super(nombre, edad);
        this.numeroCamiseta = numeroCamiseta;
    }
}

class Entrenador extends MiembroEquipo {
    protected String esquemaFavorito;

    public Entrenador(String nombre, int edad, String esquemaFavorito) {
        super(nombre, edad);
        this.esquemaFavorito = esquemaFavorito;
    }
}

public class EjercicioSolo {
    public static void main(String[] args) {
        Futbolista jugador1 = new Futbolista("Marcelo Amaya", 22, 10);
        Entrenador entrenador1 = new Entrenador("Roberto Mosquera", 56, "4-3-3");

        System.out.println("Futbolista: " + jugador1.nombre + ", Edad: " + jugador1.edad + ", Número de Camiseta: " + jugador1.numeroCamiseta);
        System.out.println("Entrenador: " + entrenador1.nombre + ", Edad: " + entrenador1.edad + ", Esquema Favorito: " + entrenador1.esquemaFavorito);
    }
}
