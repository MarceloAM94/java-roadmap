abstract class Campeon {
    String nombre;

    public Campeon(String nombre) {
        this.nombre = nombre;
    }

    public void recall(){
        System.out.println("El campeon " + this.nombre + " esta regresando a base...");
    }

    public abstract void usarUltimate();
}

class Tirador extends Campeon {
    public Tirador(String nombre) {
        super(nombre);
    }

    @Override
    public void usarUltimate() {
        System.out.println("El tirador " + this.nombre + " dispara un proyectil masivo a distancia...");
    }
}

class Soporte extends Campeon {
    public Soporte(String nombre) {
        super(nombre);
    }

    @Override
    public void usarUltimate() {
        System.out.println("El soporte " + this.nombre + " invoca escudos para sus aliados...");
    }
}

public class EjercicioSolo {
    public static void main(String[] args) {
        Campeon[] campeones = {new Tirador("Ashe"), new Soporte("Janna")};

        for (Campeon campeon : campeones) {
            campeon.recall();
            campeon.usarUltimate();
        }
    }
}
