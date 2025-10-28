public class mesa {
    // Atributos
    String material;
    String color;
    String marca;
    double tamaño;
    boolean ocupada;

    // Métodos
    void usar() {
        ocupada = true;
        System.out.println("La mesa está siendo usada.");
    }

    void dejarDeUsar() {
        ocupada = false;
        System.out.println("La mesa está libre.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color de la mesa ahora es " + color + ".");
    }

    void cambiarTamaño(String nuevoTamaño) {
        material = nuevoTamaño;
        System.out.println("La mesa ahora es de " + material + ".");
    }
}
