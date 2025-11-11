package main

import "fmt"

// 1. Struct Cafeteria
type Cafeteria struct {
	Nombre    string
	Ubicacion string
	Empleados int
}

func (c Cafeteria) Abrir() {
	fmt.Println("La cafetería está abierta.")
}

func (c Cafeteria) Cerrar() {
	fmt.Println("La cafetería ha cerrado.")
}

func (c Cafeteria) MostrarInfo() {
	fmt.Println("Cafetería:", c.Nombre, "- Ubicación:", c.Ubicacion, "- Empleados:", c.Empleados)
}

// 2. Struct Restaurante
type Restaurante struct {
	Nombre      string
	TipoComida  string
	Capacidad   int
}

func (r Restaurante) Abrir() {
	fmt.Println("El restaurante ha abierto sus puertas.")
}

func (r Restaurante) Cerrar() {
	fmt.Println("El restaurante ha cerrado por hoy.")
}

func (r Restaurante) MostrarDatos() {
	fmt.Println("Restaurante:", r.Nombre, "- Tipo:", r.TipoComida, "- Capacidad:", r.Capacidad)
}

// 3. Struct Libro
type Libro struct {
	Titulo string
	Autor  string
	Paginas int
}

func (l Libro) Leer() {
	fmt.Println("Leyendo el libro:", l.Titulo, "de", l.Autor)
}

func (l Libro) MarcarPagina(pagina int) {
	fmt.Println("Marcando la página", pagina, "del libro:", l.Titulo)
}

// 4. Struct Vehiculo
type Vehiculo struct {
	Marca  string
	Modelo string
	Año    int
}

func (v Vehiculo) Encender() {
	fmt.Println("El vehículo ha sido encendido.")
}

func (v Vehiculo) Apagar() {
	fmt.Println("El vehículo ha sido apagado.")
}

func (v Vehiculo) MostrarInfo() {
	fmt.Println("Vehículo:", v.Marca, v.Modelo, "- Año:", v.Año)
}

// 5. Struct Estudiante
type Estudiante struct {
	Nombre  string
	Edad    int
	Carrera string
}

func (e Estudiante) Presentarse() {
	fmt.Println("Hola, soy", e.Nombre, "y estudio", e.Carrera)
}

func (e *Estudiante) CumplirAnios() {
	e.Edad++
	fmt.Println(e.Nombre, "ahora tiene", e.Edad, "años.")
}
