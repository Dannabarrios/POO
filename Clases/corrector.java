class corrector {
    String color; String tipo; String marca; String tamaño;
    boolean usado;

    void usar() { usado = true; System.out.println("El corrector está siendo usado."); }
    void guardar() { usado = false; System.out.println("El corrector ha sido guardado."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color del corrector ahora es " + color + "."); }
    void cambiarTamaño(String nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño del corrector ahora es " + tamaño + "."); }
}