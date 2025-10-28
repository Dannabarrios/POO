class tomaCorriente {
    String color; String tipo; String marca;
    double voltaje; boolean conectada;

    void conectar() { conectada = true; System.out.println("Se ha conectado un dispositivo a la toma corriente."); }
    void desconectar() { conectada = false; System.out.println("El dispositivo ha sido desconectado de la toma corriente."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color de la toma corriente ahora es " + color + "."); }
    void cambiarVoltaje(double nuevoVoltaje) { voltaje = nuevoVoltaje; System.out.println("El voltaje de la toma corriente ahora es de " + voltaje + "V."); }
}