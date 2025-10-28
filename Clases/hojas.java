class hojas {
    String color; String tamaño; String tipo;
    int cantidad; boolean presentes;

    void agregar() { presentes = true; System.out.println("Se han agregado hojas."); }
    void quitar() { presentes = false; System.out.println("Se han quitado las hojas."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color de las hojas ahora es " + color + "."); }
    void cambiarTamaño(String nuevoTamaño) { tamaño = nuevoTamaño; System.out.println("El tamaño de las hojas ahora es " + tamaño + "."); }
}