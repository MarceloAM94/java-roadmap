class UsuarioUTP {
    public void accederSistema(){
        System.out.println("Accediendo al portar principal generico de la UTP...");
    }
}

class Estudiante extends UsuarioUTP{
    @Override
    public void accederSistema() {
        System.out.println("Accediendo a Canvas y Portal del Estudiante...");
    }
}

class Docente extends UsuarioUTP{
    @Override
    public void accederSistema() {
        System.out.println("Accediendo al Registro de Notas y Canvas Docente...");
    }
}

public class EjercicioSolo {
    public static void main(String[] args) {
        UsuarioUTP[] usuarios = {new Estudiante(), new Docente(), new UsuarioUTP()};

        for (UsuarioUTP usuario : usuarios) {
            usuario.accederSistema();
        }
    }
}
