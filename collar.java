public class collar {
    // Atributos
    String color;
    String material;
    String tipo;
    String tamaño;
    boolean puesto;

    // Métodos
    void poner() {
        puesto = true;
        System.out.println("El collar ha sido puesto.");
    }

    void quitar() {
        puesto = false;
        System.out.println("El collar ha sido quitado.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del collar ahora es " + color + ".");
    }

    void cambiarMaterial(String nuevoMaterial) {
        material = nuevoMaterial;
        System.out.println("El material del collar ahora es " + material + ".");
    }
}
