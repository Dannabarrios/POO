public class pulsera {
    // Atributos
    String material;
    String color;
    String marca;
    double tamaño;
    boolean puesta;

    // Métodos
    void poner() {
        puesta = true;
        System.out.println("La pulsera ha sido puesta.");
    }

    void quitar() {
        puesta = false;
        System.out.println("La pulsera ha sido quitada.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color de la pulsera ahora es " + color + ".");
    }

    void cambiarMaterial(String nuevoMaterial) {
        material = nuevoMaterial;
        System.out.println("El material de la pulsera ahora es " + material + ".");
    }
}
