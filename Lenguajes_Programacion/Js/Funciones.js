// 1. Clase Cafeteria
class Cafeteria {
  calcularIngreso(precio, ventas) {
    return precio * ventas;
  }
}

// 2. Clase Restaurante
class Restaurante {
  calcularCuenta(precioPlato, cantidad) {
    return precioPlato * cantidad;
  }
}

// 3. Clase Libro
class Libro {
  paginasRestantes(total, leidas) {
    return total - leidas;
  }
}

// 4. Clase Vehiculo
class Vehiculo {
  requiereMantenimiento(kilometros) {
    return kilometros >= 10000;
  }
}

// 5. Clase Estudiante
class Estudiante {
  aprobado(promedio) {
    return promedio >= 3.0;
  }
}
