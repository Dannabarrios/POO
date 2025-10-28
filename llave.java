public class llave {
    // Atributos
    String tipo;
    String material;
    String color;
    double tamaño;
    boolean insertada;

    // Métodos
    void insertar() {
        insertada = true;
        System.out.println("La llave ha sido insertada.");
    }

    void retirar() {
        insertada = false;
        System.out.println("La llave ha sido retirada.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color de la llave ahora es " + color + ".");
    }

    void cambiarMaterial(String nuevoMaterial) {
        material = nuevoMaterial;
        System.out.println("El material de la llave ahora es " + material + ".");
    }
}
