package main

import "fmt"

// 1. Struct Cafeteria
type Cafeteria struct {
	Nombre, Ubicacion string
	Empleados         int
}

func (c Cafeteria) Abrir()     { fmt.Println("Cafetería abierta.") }
func (c Cafeteria) Cerrar()    { fmt.Println("Cafetería cerrada.") }
func (c Cafeteria) Mostrar()   { fmt.Println(c.Nombre, "-", c.Ubicacion, "-", c.Empleados, "empleados") }

// 2. Struct Restaurante
type Restaurante struct {
	Nombre, TipoComida string
	Capacidad          int
}

func (r Restaurante) Abrir()   { fmt.Println("Restaurante abierto.") }
func (r Restaurante) Mostrar() { fmt.Println(r.Nombre, "-", r.TipoComida, "-", r.Capacidad, "personas") }

// 3. Struct Libro
type Libro struct {
	Titulo, Autor string
	Paginas       int
}

func (l Libro) Leer()         { fmt.Println("Leyendo:", l.Titulo) }
func (l Libro) Mostrar()      { fmt.Println(l.Titulo, "-", l.Autor, "-", l.Paginas, "páginas") }

// 4. Struct Vehiculo
type Vehiculo struct {
	Marca, Modelo string
	Año           int
}

func (v Vehiculo) Encender()  { fmt.Println("Encendiendo:", v.Marca, v.Modelo) }
func (v Vehiculo) Mostrar()   { fmt.Println(v.Marca, v.Modelo, "-", v.Año) }

// 5. Struct Estudiante
type Estudiante struct {
	Nombre, Carrera string
	Edad            int
}

func (e Estudiante) Presentarse() { fmt.Println("Soy", e.Nombre, "y estudio", e.Carrera) }
func (e *Estudiante) CumplirAnios() {
	e.Edad++
	fmt.Println(e.Nombre, "ahora tiene", e.Edad)
}
