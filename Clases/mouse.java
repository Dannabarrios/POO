class mouse {
    String tipo;
    String color;
    String marca;
    double tamaño;
    boolean encendido;

    void encender() { encendido = true; System.out.println("El mouse está encendido."); }
    void apagar() { encendido = false; System.out.println("El mouse está apagado."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color del mouse ahora es " + color + "."); }
    void cambiarTamaño(double nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño/DPI del mouse ahora es " + tamaño + "."); }
}