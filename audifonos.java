public class audifonos {
    // Atributos
    String tipo;
    String color;
    String marca;
    double tamaño;
    boolean encendido;

    // Métodos
    void encender() {
        encendido = true;
        System.out.println("Los audífonos están encendidos.");
    }

    void apagar() {
        encendido = false;
        System.out.println("Los audífonos están apagados.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color de los audífonos ahora es " + color + ".");
    }

    void cambiarTamaño(double nuevoTamaño) {
        tamaño = nuevoTamaño;
        System.out.println("El tamaño de los audífonos ahora es de " + tamaño + " cm.");
    }
}
