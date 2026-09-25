class Evaluacion{
    private String curso;
    private int nota;

    Evaluacion(String curso, int nota){
        this.curso = curso;
        this.nota = nota;
    }

    public String getCurso(){
        return this.curso;
    }

    public int getNota(){
        return this.nota;
    }

    public void setNota(int nuevaNota) {
        if(nuevaNota >= 0 && nuevaNota <= 20) {
            this.nota = nuevaNota;
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 20.");
        }
    }
}

public class EjercicioGuiado {
    public static void main(String[] args) {
        Evaluacion eva1 = new Evaluacion("Algoritmos", 15);

        System.out.println("Nota actual: " + eva1.getNota());
        eva1.setNota(25);
    }
}
