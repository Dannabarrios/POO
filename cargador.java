public class cargador {
    // Atributos
    String tipo;
    String color;
    String marca;
    double voltaje;
    boolean conectado;

    // Métodos
    void conectar() {
        conectado = true;
        System.out.println("El cargador está conectado.");
    }

    void desconectar() {
        conectado = false;
        System.out.println("El cargador está desconectado.");
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del cargador ahora es " + color + ".");
    }

    void cambiarVoltaje(double nuevoVoltaje) {
        voltaje = nuevoVoltaje;
        System.out.println("El voltaje del cargador ahora es de " + voltaje + "V.");
    }
}
