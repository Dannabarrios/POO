public class libro {
    // Atributos
    String titulo;
    String autor;
    String color;
    String tamaño;
    boolean abierto;

    // Métodos
    void abrir() {
        abierto = true;
        System.out.println("El libro ha sido abierto.");
    }

    void cerrar() {
        abierto = false;
        System.out.println("El libro ha sido cerrado.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del libro ahora es " + color + ".");
    }

    void cambiarTamaño(String nuevoTamaño) {
        tamaño = nuevoTamaño;
        System.out.println("El tamaño del libro ahora es " + tamaño + ".");
    }
}
