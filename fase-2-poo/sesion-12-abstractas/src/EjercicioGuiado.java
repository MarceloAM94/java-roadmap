abstract class EmpleadoUTP {
    String nombre;

    public EmpleadoUTP(String nombre) {
        this.nombre = nombre;
    }

    public void ficharIngreso(){
        System.out.println("El empleado " + this.nombre + " ha registrado su entrada en el biometrico.");
    }

    public abstract void trabajar();
}

class Profesor extends EmpleadoUTP {
    public Profesor(String nombre) {
        super(nombre);
    }

    @Override
    public void trabajar() {
        System.out.println("Dictando clases a los alumnos de primer ciclo...");
    }
}

class Seguridad extends EmpleadoUTP {
    public Seguridad(String nombre) {
        super(nombre);
    }

    @Override
    public void trabajar() {
        System.out.println("Vigilando la puerta principal del campus...");
    }
}

public class EjercicioGuiado {
    public static void main(String[] args) {
        EmpleadoUTP[] empleados = {new Profesor("Pedro Campos"), new Seguridad("Luis Ramos")};

        for (EmpleadoUTP empleado : empleados) {
            empleado.ficharIngreso();
            empleado.trabajar();
        }
    }
}
