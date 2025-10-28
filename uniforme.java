public class uniforme {
    // Atributos
    String color;
    String talla;
    String tipo;
    String material;
    boolean puesto;

    // Métodos
    void poner() {
        puesto = true;
        System.out.println("El uniforme ha sido puesto.");
    }

    void quitar() {
        puesto = false;
        System.out.println("El uniforme ha sido quitado.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del uniforme ahora es " + color + ".");
    }

    void cambiarTamaño(String nuevaTalla) {
        talla = nuevaTalla;
        System.out.println("La talla del uniforme ahora es " + talla + ".");
    }
}
