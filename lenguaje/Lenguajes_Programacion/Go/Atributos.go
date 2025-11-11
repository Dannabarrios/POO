package main

// 1. Struct Cafeteria
type Cafeteria struct {
	Nombre    string
	Ubicacion string
	Empleados int
	Abierta   bool
}

// 2. Struct Restaurante
type Restaurante struct {
	Nombre     string
	TipoComida string
	Capacidad  int
	Abierto    bool
}

// 3. Struct Libro
type Libro struct {
	Titulo    string
	Autor     string
	Paginas   int
	Editorial string
}

// 4. Struct Vehiculo
type Vehiculo struct {
	Marca  string
	Modelo string
	Color  string
	Año    int
}

// 5. Struct Estudiante
type Estudiante struct {
	Nombre  string
	Edad    int
	Carrera string
	Activo  bool
}
