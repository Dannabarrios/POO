class luz {
    String tipo; String color; String marca;
    int intensidad; boolean encendida;

    void encender() { encendida = true; System.out.println("La luz está encendida."); }
    void apagar() { encendida = false; System.out.println("La luz está apagada."); }
    void cambiarColor(String nuevoColor) { color = nuevoColor; System.out.println("El color de la luz ahora es " + color + "."); }
    void cambiarIntensidad(int nuevaIntensidad) { intensidad = nuevaIntensidad; System.out.println("La intensidad de la luz ahora es de " + intensidad + "%."); }
}