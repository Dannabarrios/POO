// 1. Clase Cafeteria
class Cafeteria {
    public String nombre = "El Tomo Café"; // público
    private String contraseñaWifi = "Cafe123"; // privado
    protected int empleados = 5; // protegido

    public void mostrarInfo() {
        System.out.println("Cafetería: " + nombre);
        System.out.println("Empleados (protegido): " + empleados);
        System.out.println("Contraseña WiFi (privado, solo aquí): " + contraseñaWifi);
    }
}

// 2. Clase Restaurante
class Restaurante {
    public String nombre = "La Fogata"; // público
    private double ventasDelDia = 1250000; // privado
    protected String tipoComida = "Asados"; // protegido

    public void mostrarDatos() {
        System.out.println("Restaurante: " + nombre);
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Ventas del día (privado): $" + ventasDelDia);
    }
}

// 3. Clase Libro
class Libro {
    public String titulo = "El café del alma"; // público
    private String isbn = "978-958-1234567"; // privado
    protected String autor = "Andrés Barrios"; // protegido

    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor (protegido): " + autor);
        System.out.println("ISBN (privado): " + isbn);
    }
}

// 4. Clase Vehiculo
class Vehiculo {
    public String marca = "Toyota"; // público
    private double valor = 95000000; // privado
    protected String propietario = "Valentina"; // protegido

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Propietario (protegido): " + propietario);
        System.out.println("Valor (privado): $" + valor);
    }
}

// 5. Clase Estudiante
class Estudiante {
    public String nombre = "Camila"; // público
    private int edad = 21; // privado
    protected String carrera = "Ingeniería"; // protegido

    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Carrera (protegida): " + carrera);
        System.out.println("Edad (privada): " + edad);
    }
}
