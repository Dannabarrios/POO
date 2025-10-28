class gafas {
    String color; String material; String tipo; String tamaño;
    boolean puestas;

    void poner() { puestas = true; System.out.println("Las gafas han sido puestas."); }
    void quitar() { puestas = false; System.out.println("Las gafas han sido quitadas."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color de las gafas ahora es " + color + "."); }
    void cambiarTamaño(String nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño de las gafas ahora es " + tamaño + "."); }
}