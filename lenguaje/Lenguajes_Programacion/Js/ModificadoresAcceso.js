// 1. Clase Cafeteria
class Cafeteria {
  #claveWifi = "Cafe123"; // privado
  constructor(nombre) {
    this.nombre = nombre; // público
  }
  mostrarInfo() {
    console.log("Cafetería:", this.nombre, "- Clave WiFi:", this.#claveWifi);
  }
}

// 2. Clase Restaurante
class Restaurante {
  #ventas = 1200000; // privado
  constructor(nombre, tipo) {
    this.nombre = nombre;
    this.tipo = tipo;
  }
  mostrarDatos() {
    console.log(`${this.nombre} - ${this.tipo} - Ventas: $${this.#ventas}`);
  }
}

// 3. Clase Libro
class Libro {
  #isbn = "978-958-1234567"; // privado
  constructor(titulo, autor) {
    this.titulo = titulo;
    this.autor = autor;
  }
  mostrar() {
    console.log(`${this.titulo} - ${this.autor} - ISBN: ${this.#isbn}`);
  }
}

// 4. Clase Vehiculo
class Vehiculo {
  #valor = 95000000; // privado
  constructor(marca, modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }
  info() {
    console.log(`${this.marca} ${this.modelo} - Valor: $${this.#valor}`);
  }
}

// 5. Clase Estudiante
class Estudiante {
#edad = 21; // privado
  constructor(nombre, carrera) {
    this.nombre = nombre;
    this.carrera = carrera;
  }
  mostrarDatos() {
    console.log(`${this.nombre} - ${this.carrera} - Edad: ${this.#edad}`);
  }
}
