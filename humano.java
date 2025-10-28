public class humano {
    // Atributos
    String nombre;
    int edad;
    String genero;
    String nacionalidad;
    boolean despierto;

    // Métodos
    void caminar() {
        System.out.println(nombre + " está caminando.");
    }

    void dormir() {
        despierto = false;
        System.out.println(nombre + " está durmiendo.");
    }

    void despertar() {
        despierto = true;
        System.out.println(nombre + " se ha despertado.");
    }

    void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
        System.out.println("El nombre ahora es " + nombre + ".");
    }

    void cambiarEdad(int nuevaEdad) {
        edad = nuevaEdad;
        System.out.println("La edad ahora es " + edad + " años.");
    }
}
