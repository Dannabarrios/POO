public class puerta {
    // Atributos
    String material;
    String color;
    String tipo;
    double tamaño;
    boolean abierta;

    // Métodos
    void abrir() {
        abierta = true;
        System.out.println("La puerta está abierta.");
    }

    void cerrar() {
        abierta = false;
        System.out.println("La puerta está cerrada.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color de la puerta ahora es " + color + ".");
    }

    void cambiarMaterial(String nuevoMaterial) {
        material = nuevoMaterial;
        System.out.println("El material de la puerta ahora es " + material + ".");
    }
}
