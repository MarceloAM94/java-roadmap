class Persona {
    protected String nombre;
    protected String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}

class Alumno extends Persona {
    String codigoUTP;

    public Alumno(String nombre, String dni, String codigoUTP) {
        super(nombre, dni);
        this.codigoUTP = codigoUTP;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Código UTP: " + this.codigoUTP);
    }
}

public class EjercicioGuiado {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan Perez", "12345678", "UTP2024");
        alumno1.mostrarDatos();
    }
}
