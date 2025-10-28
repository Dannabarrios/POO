public class señalizacion {
    // Atributos
    String tipo;
    String color;
    String material;
    String ubicacion;
    boolean colocada;

    // Métodos
    void colocar() {
        colocada = true;
        System.out.println("La señalización ha sido colocada.");
    }

    void retirar() {
        colocada = false;
        System.out.println("La señalización ha sido retirada.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color de la señalización ahora es " + color + ".");
    }

    void cambiarTipo(String nuevoTipo) {
        tipo = nuevoTipo;
        System.out.println("El tipo de señalización ahora es " + tipo + ".");
    }
}
