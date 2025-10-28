public class celular {
    // Atributos
    String marca;
    String color;
    String tipo;
    double tamaño;
    boolean encendido;

    // Métodos
    void encender() {
        encendido = true;
        System.out.println("El celular está encendido.");
    }

    void apagar() {
        encendido = false;
        System.out.println("El celular está apagado.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del celular ahora es " + color + ".");
    }

    void cambiarTamaño(double nuevoTamaño) {
        tamaño = nuevoTamaño;
        System.out.println("El tamaño del celular ahora es de " + tamaño + " pulgadas.");
    }

    void marca() {
        System.out.println("La marca del celular es " + marca + ".");
    }
}
