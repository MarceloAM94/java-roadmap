class JugadorCampo {
    public void celebrarGol(){
        System.out.println("Celebra corriendo hacia el corner...");
    }
}

class Delantero extends JugadorCampo {
    @Override
    public void celebrarGol() {
        System.out.println("Celebra haciendo una voltereta acrobatica...");
    }
}

class Defensa extends JugadorCampo {
    @Override
    public void celebrarGol() {
        System.out.println("Celebra besando el escudo del club...");
    }
}

public class EjercicioGuiado {
    public static void main(String[] args) {
        JugadorCampo[] jugadores = {new Delantero(), new Defensa(), new JugadorCampo()};

        for (JugadorCampo jugador : jugadores) {
            jugador.celebrarGol();
        }
    }
}
