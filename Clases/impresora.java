class impresora {
    String marca; String color; String tipo;
    double tamaño; boolean encendida;

    void encender() { encendida = true; System.out.println("La impresora está encendida."); }
    void apagar() { encendida = false; System.out.println("La impresora está apagada."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color de la impresora ahora es " + color + "."); }
    void cambiarTamaño(double nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño de la impresora ahora es de " + tamaño + " cm."); }
}