// 1. Clase Cafeteria
class Cafeteria {
  constructor(nombre) {
    this.nombre = nombre;
  }
  abrir() {
    console.log(this.nombre + " está abierta.");
  }
}

// 2. Clase Restaurante
class Restaurante {
  constructor(nombre) {
    this.nombre = nombre;
  }
  atender() {
    console.log(this.nombre + " está atendiendo clientes.");
  }
}

// 3. Clase Libro
class Libro {
  constructor(titulo) {
    this.titulo = titulo;
  }
  leer() {
    console.log("Leyendo el libro:", this.titulo);
  }
}

// 4. Clase Vehiculo
class Vehiculo {
  constructor(marca) {
    this.marca = marca;
  }
  encender() {
    console.log("El vehículo " + this.marca + " está encendido.");
  }
}

// 5. Clase Estudiante
class Estudiante {
  constructor(nombre) {
    this.nombre = nombre;
  }
  presentarse() {
    console.log("Hola, soy " + this.nombre);
  }
}
