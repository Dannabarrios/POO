class uniforme {
    String color; String tamaño; String tipo; String material;
    boolean puesto;

    void poner() { puesto = true; System.out.println("El uniforme ha sido puesto."); }
    void quitar() { puesto = false; System.out.println("El uniforme ha sido quitado."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color del uniforme ahora es " + color + "."); }
    void cambiarTamaño(String nuevaTalla) { tamaño = nuevaTalla; System.out.println("La talla del uniforme ahora es " + tamaño + "."); }
}