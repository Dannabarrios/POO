public class televisor {
    // Atributos
    String tipo;
    String color;
    String marca;
    double tamaño;
    boolean encendido;

    // Métodos
    void encender() {
        encendido = true;
        System.out.println("El televisor está encendido.");
    }

    void apagar() {
        encendido = false;
        System.out.println("El televisor está apagado.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del televisor ahora es " + color + ".");
    }

    void cambiarTamaño(double nuevoTamaño) {
        tamaño = nuevoTamaño;
        System.out.println("El tamaño del televisor ahora es de " + tamaño + " pulgadas.");
    }
}
