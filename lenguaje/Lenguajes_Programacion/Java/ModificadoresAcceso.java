// 1. Clase Cafeteria
class Cafeteria {
    public String nombre = "El Tomo Café"; // Público
    private String claveWifi = "Cafe123"; // Privado
    protected int empleados = 5; // Protegido
    public String ubicacion;

    public void mostrarInfo() {
        System.out.println("Cafetería: " + nombre);
        System.out.println("Empleados (protegido): " + empleados);
        System.out.println("Clave WiFi (privada): " + claveWifi);
    }
}

// 2. Clase Restaurante
class Restaurante {
    public String nombre = "La Fogata"; // Público
    private double ventasDelDia = 1250000; // Privado
    protected String tipoComida = "Asados"; // Protegido
    public int capacidad;

    public void mostrarDatos() {
        System.out.println("Restaurante: " + nombre);
        System.out.println("Tipo de comida (protegido): " + tipoComida);
        System.out.println("Ventas del día (privado): $" + ventasDelDia);
    }
}

// 3. Clase Libro
class Libro {
    public String titulo = "El café del alma"; // Público
    private String isbn = "978-958-1234567"; // Privado
    protected String autor = "Andrés Barrios"; // Protegido
    public int paginas;

    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor (protegido): " + autor);
        System.out.println("ISBN (privado): " + isbn);
    }
}

// 4. Clase Vehiculo
class Vehiculo {
    public String marca = "Toyota"; // Público
    private double valor = 95000000; // Privado
    protected String propietario = "Valentina"; // Protegido
    public String modelo;
    public int año;

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Propietario (protegido): " + propietario);
        System.out.println("Valor (privado): $" + valor);
    }
}

// 5. Clase Estudiante
class Estudiante {
    public String nombre = "Camila"; // Público
    int edad = 21; // Privado
    protected String carrera = "Ingeniería"; // Protegido

    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Carrera (protegida): " + carrera);
        System.out.println("Edad (privada): " + edad);
    }
}
