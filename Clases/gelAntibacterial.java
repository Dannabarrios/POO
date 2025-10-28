class gelAntibacterial {
    String marca; String color; String aroma;
    double tamaño; boolean abierto;

    void abrir() { abierto = true; System.out.println("El gel antibacterial ha sido abierto."); }
    void cerrar() { abierto = false; System.out.println("El gel antibacterial ha sido cerrado."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color del gel antibacterial ahora es " + color + "."); }
    void cambiarTamaño(double nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño del gel antibacterial ahora es de " + tamaño + " ml."); }
    void cambiarAroma(String nuevoAroma) { aroma = nuevoAroma; System.out.println("El aroma del gel antibacterial ahora es " + aroma + "."); }
}