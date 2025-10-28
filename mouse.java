public class mouse {
    // Atributos
    String tipo; // Inalámbrico o con cable
    String color;
    String marca;
    double tamaño; // Tamaño en centímetros
    boolean encendido; // Estado del mouse

    // Métodos
    void encender() {
        encendido = true;
        System.out.println("El mouse está encendido.");
    }

    void apagar() {
        encendido = false;
        System.out.println("El mouse está apagado.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del mouse ahora es " + color + ".");
    }

    void cambiarTamaño(double nuevoTamaño) {
        tamaño = nuevoTamaño;
        System.out.println("El tamaño del mouse ahora es de " + tamaño + " cm.");
    }
}
