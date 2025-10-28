class recogedor {
    String material;
    String color;
    String tamaño;
    boolean enUso;

    void usar() { enUso = true; System.out.println("El recogedor está en uso."); }
    void dejarDeUsar() { enUso = false; System.out.println("El recogedor ha dejado de usarse."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color del recogedor ahora es " + color + "."); }
    void cambiarTamaño(String nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño del recogedor ahora es " + tamaño + "."); }
}