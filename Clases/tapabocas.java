class tapabocas {
    String color; String tamaño; String tipo; String material;
    boolean puesto;

    void poner() { puesto = true; System.out.println("El tapabocas ha sido puesto."); }
    void quitar() { puesto = false; System.out.println("El tapabocas ha sido quitado."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color del tapabocas ahora es " + color + "."); }
    void cambiarTamaño(String nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño del tapabocas ahora es " + tamaño + "."); }
}