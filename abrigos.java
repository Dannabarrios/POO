public class abrigos {
    // Atributos
    String color;
    String talla;
    String material;
    String tipo;
    boolean puesto;

    // Métodos
    void poner() {
        puesto = true;
        System.out.println("El abrigo ha sido puesto.");
    }

    void quitar() {
        puesto = false;
        System.out.println("El abrigo ha sido quitado.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del abrigo ahora es " + color + ".");
    }

    void cambiarTamaño(String nuevaTalla) {
        talla = nuevaTalla;
        System.out.println("La talla del abrigo ahora es " + talla + ".");
    }
}
