// ==========================================
// EJERCICIOS ANTERIORES (Historial de la sesión)
// ==========================================

/*
class Estudiante {
    String nombre;
    int ciclo;

    Estudiante(String nombre, int ciclo) {
        this.nombre = nombre; // Aquí faltaba el 'this' en tu código comentado
        this.ciclo = ciclo;
    }
}
*/

/*
class Jugador {
    String nickname;
    int nivel;
    int puntos;

    Jugador(String nickname, int nivel) {
        this.nickname = nickname;
        this.nivel = nivel;
        this.puntos = 0;
    }
}
*/

// ==========================================
// EJERCICIO FINAL ACTIVO
// ==========================================

class Partido {
    String rival;
    int golesCristal;
    int golesRival;

    Partido(String rival, int golesCristal, int golesRival) {
        this.rival = rival;
        this.golesCristal = golesCristal;
        this.golesRival = golesRival;
    }
}

public class Main {
    public static void main(String[] args) {

        // Instancias de ejercicios anteriores (Comentadas)
        // Estudiante marcelo = new Estudiante("Marcelo", 1);
        // System.out.println(marcelo);

        // Jugador jugador1 = new Jugador("Draxxx94", 1);
        // System.out.println("Jugador: " + jugador1.nickname + " | Nivel: " + jugador1.nivel);

        // ----------------------------------------
        // Código activo: Historial de Partidos
        // ----------------------------------------
        Partido[] partidos = new Partido[3];
        partidos[0] = new Partido("Olianza Lima", 1, 1);
        partidos[1] = new Partido("Gallinas", 3, 0);
        partidos[2] = new Partido("Palmeiras", 0, 2);

        // Bucle con la variable 'i' declarada directamente dentro del for (Clean Code)
        for (Partido partido : partidos) {
            if (partido.golesCristal > partido.golesRival) {
                System.out.println("Victoria de Cristal contra " + partido.rival + " con marcador " + partido.golesCristal + " - " + partido.golesRival);
            } else if (partido.golesCristal < partido.golesRival) {
                System.out.println("Derrota de Cristal contra " + partido.rival + " con marcador " + partido.golesCristal + " - " + partido.golesRival);
            } else {
                System.out.println("Empate de Cristal contra " + partido.rival + " con marcador " + partido.golesCristal + " - " + partido.golesRival);
            }
        }
    }
}