class escoba {
    String material;
    String color;
    String tamaño;
    boolean enUso;

    void usar() { enUso = true; System.out.println("La escoba está en uso."); }
    void dejarDeUsar() { enUso = false; System.out.println("La escoba ha dejado de usarse."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color de la escoba ahora es " + color + "."); }
    void cambiarTamaño(String nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño de la escoba ahora es " + tamaño + "."); }
}