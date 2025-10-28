public class aireAcondicionado {
    // Atributos
    String marca;
    int potencia;
    int temperatura;
    String modo;
    boolean encendido;

    // Métodos
    void encender() {
        encendido = true;
        System.out.println("El aire acondicionado se ha encendido.");
    }

    void apagar() {
        encendido = false;
        System.out.println("El aire acondicionado se ha apagado.");
    }

    void cambiarTemperatura(int nuevaTemperatura) {
        temperatura = nuevaTemperatura;
        System.out.println("La temperatura ahora es de 20°C");
    }

    void cambiarModo(String nuevoModo) {
        modo = nuevoModo;
        System.out.println("El modo se ha cambiado a " + modo);
    }
}
