public class sillas {
    // Atributos
    String material;
    String color;
    String tipo;
    double tamaño;
    boolean ocupada;

    // Métodos
    void sentarse() {
        ocupada = true;
        System.out.println("Alguien se ha sentado en la silla.");
    }

    void levantarse() {
        ocupada = false;
        System.out.println("La silla está libre.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color de la silla ahora es " + color + ".");
    }

    void cambiarMaterial(String nuevoMaterial) {
        material = nuevoMaterial;
        System.out.println("El material de la silla ahora es " + material + ".");
    }
}
