public class computador {
    // Atributos
    String tipo; // Portatil o de escritorio
    String color;
    String marca;
    double tamaño; // pulgadas
    boolean encendido; // Estado

    // Métodos
    void encender() {
        encendido = true;
        System.out.println("El computador está encendido.");
    }

    void apagar() {
        encendido = false;
        System.out.println("El computador está apagado.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del computador ahora es " + color + ".");
    }

    void cambiarTamaño(double nuevoTamaño) {
        tamaño = nuevoTamaño;
        System.out.println("El tamaño del computador ahora es de " + tamaño + " pulgadas.");
    }
}
