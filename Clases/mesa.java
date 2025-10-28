class mesa {
    String material;
    String color;
    String tamaño;
    boolean ocupada;

    void usar() { ocupada = true; System.out.println("La mesa está siendo usada."); }
    void dejarDeUsar() { ocupada = false; System.out.println("La mesa está libre."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color de la mesa ahora es " + color + "."); }
    void cambiarTamaño(String nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño de la mesa ahora es " + tamaño + "."); }
}