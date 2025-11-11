// 1. Clase Cafeteria
class Cafeteria {
  constructor(nombre, ubicacion) {
    this.nombre = nombre;
    this.ubicacion = ubicacion;
  }
  abrir() {
    console.log("La cafetería está abierta.");
  }
}

// 2. Clase Restaurante
class Restaurante {
  constructor(nombre, tipo) {
    this.nombre = nombre;
    this.tipo = tipo;
  }
  abrir() {
    console.log("El restaurante está atendiendo.");
  }
}

// 3. Clase Libro
class Libro {
  constructor(titulo, autor) {
    this.titulo = titulo;
    this.autor = autor;
  }
  leer() {
    console.log("Leyendo el libro:", this.titulo);
  }
}

// 4. Clase Vehiculo
class Vehiculo {
  constructor(marca, modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }
  encender() {
    console.log("El vehículo está encendido.");
  }
}

// 5. Clase Estudiante
class Estudiante {
  constructor(nombre, carrera) {
    this.nombre = nombre;
    this.carrera = carrera;
  }
  presentarse() {
    console.log("Hola, soy " + this.nombre + " y estudio " + this.carrera);
  }
}
