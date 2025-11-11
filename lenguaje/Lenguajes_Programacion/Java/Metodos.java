// 1. Clase Cafeteria
class Cafeteria {
    String nombre;
    String ubicacion;
    int empleados;

    void abrir() {
        System.out.println("La cafetería está abierta.");
    }

    void cerrar() {
        System.out.println("La cafetería ha cerrado.");
    }

    void mostrarInfo() {
        System.out.println("Cafetería: " + nombre + " - Ubicación: " + ubicacion + " - Empleados: " + empleados);
    }
}

// 2. Clase Restaurante
class Restaurante {
    String nombre = "La Fogata";
    String tipoComida = "Asados";
    int capacidad = 80;

    void abrir() {
        System.out.println("El restaurante ha abierto sus puertas.");
    }

    void cerrar() {
        System.out.println("El restaurante ha cerrado por hoy.");
    }

    void mostrarDatos() {
        System.out.println("Restaurante: " + nombre + " - Tipo: " + tipoComida + " - Capacidad: " + capacidad);
    }
}

// 3. Clase Libro
class Libro {
    String titulo;
    String autor;
    int paginas;

    void leer() {
        System.out.println("Leyendo el libro '" + titulo + "' de " + autor);
    }

    void marcarPagina(int pagina) {
        System.out.println("Marcando la página " + pagina + " de " + titulo);
    }
}

// 4. Clase Vehiculo
class Vehiculo {
    String marca = "Toyota";
    String modelo = "Hilux";
    int año = 2022;

    void encender() {
        System.out.println("El vehículo ha sido encendido.");
    }

    void apagar() {
        System.out.println("El vehículo ha sido apagado.");
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}

// 5. Clase Estudiante
class Estudiante {
    String nombre;
    int edad;
    String carrera;

    Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    void presentarse() {
        System.out.println("Hola, soy " + nombre + " y estudio " + carrera);
    }

    void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }
}
