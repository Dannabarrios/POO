// 1. Clase Cafeteria
class Cafeteria {
    double calcularIngreso(double precioPromedio, int ventasDia) {
        double ingreso = precioPromedio * ventasDia;
        return ingreso;
    }

    boolean estaAbierta(int hora) {
        return hora >= 7 && hora <= 18;
    }
}

// 2. Clase Restaurante
class Restaurante {
    double calcularCuenta(double precioPlato, int cantidad) {
        return precioPlato * cantidad;
    }

    String obtenerTipoComida(String tipo) {
        return "Tipo de comida: " + tipo;
    }
}

// 3. Clase Libro
class Libro {
    int calcularPaginasRestantes(int paginaActual, int totalPaginas) {
        return totalPaginas - paginaActual;
    }

    String obtenerAutor(String titulo) {
        if (titulo.equals("El café del alma")) {
            return "Autor: Andrés Barrios";
        } else {
            return "Autor desconocido";
        }
    }
}

// 4. Clase Vehiculo
class Vehiculo {
    double calcularCostoViaje(double distancia, double consumoPorKm, double precioCombustible) {
        double litrosUsados = distancia * consumoPorKm;
        double costo = litrosUsados * precioCombustible;
        return costo;
    }

    boolean requiereMantenimiento(int kilometros) {
        return kilometros >= 10000;
    }
}

// 5. Clase Estudiante
class Estudiante {
    double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    boolean aprobado(double promedio) {
        return promedio >= 3.0;
    }
}
