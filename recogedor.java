public class recogedor {
    // Atributos
    String material;
    String color;
    String marca;
    double tamaño;
    boolean ocupado;

    // Métodos
    void usar() {
        ocupado = true;
        System.out.println("El recogedor está siendo usada.");
    }

    void dejarDeUsar() {
        ocupado = false;
        System.out.println("El recogedor está libre.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del recogedor ahora es " + color + ".");
    }

    void cambiarTamaño(String nuevoTamaño) {
        material = nuevoTamaño;
        System.out.println("El recogedor ahora es de " + material + ".");
    }
}
