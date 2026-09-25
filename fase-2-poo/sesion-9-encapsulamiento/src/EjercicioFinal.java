class JuegoSteam{
    private String titulo;
    private double precioBase;
    private int descuento; // % de 0 a 100

    JuegoSteam(String titulo, double precioBase){
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.descuento = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int nuevoDescuento) {
        if(nuevoDescuento >= 0 && nuevoDescuento <=100){
            this.descuento = nuevoDescuento;
        }else {
            System.out.println("Error: El descuento debe estar entre 0 y 100.");
        }

    }

    public double calcularPrecioFinal(){
        return precioBase - (precioBase * descuento / 100);
    }
}

public class EjercicioFinal {
    public static void main(String[] args) {
        JuegoSteam[] juegos = new JuegoSteam[2];

        juegos[0] = new JuegoSteam("Cyberpunk 2077", 59.99);
        juegos[1] = new JuegoSteam("The Witcher 3", 39.99);

        // Establecer descuentos
        juegos[0].setDescuento(50);
        juegos[1].setDescuento(150);

        System.out.println("Juego: " + juegos[0].getTitulo() + " | Precio Final: $" + juegos[0].calcularPrecioFinal());
        System.out.println("Juego: " + juegos[1].getTitulo() + " | Precio Final: $" + juegos[1].calcularPrecioFinal());
    }
}
