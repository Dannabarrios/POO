public class escoba {
    // Atributos
    String material;
    String color;
    String marca;
    double tamaño;
    boolean ocupada;

    // Métodos
    void usar() {
        ocupada = true;
        System.out.println("La escoba está siendo usada.");
    }

    void dejarDeUsar() {
        ocupada = false;
        System.out.println("La escoba está libre.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color de la escoba ahora es " + color + ".");
    }

    void cambiarTamaño(String nuevoTamaño) {
        material = nuevoTamaño;
        System.out.println("La escoba ahora es de " + material + ".");
    }
}
