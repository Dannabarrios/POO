class profesor {
    String nombre; String materia; int edad; String grado;
    boolean enseñando;

    void enseñar() { enseñando = true; System.out.println("El profesor está enseñando."); }
    void descansar() { enseñando = false; System.out.println("El profesor está descansando."); }
    void cambiarMateria(String nuevaMateria) { materia = nuevaMateria; System.out.println("El profesor ahora enseña " + materia + "."); }
    void cambiarEdad(int nuevaEdad) { edad = nuevaEdad; System.out.println("La edad del profesor ahora es " + edad + " años."); }
}