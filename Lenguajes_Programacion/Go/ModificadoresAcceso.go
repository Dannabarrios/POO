package main

import "fmt"

// 1. Struct Cafeteria
type Cafeteria struct {
	Nombre     string  // Público (exportado)
	ubicacion  string  // Privado (solo dentro del paquete)
	empleados  int     // Privado
}

func (c Cafeteria) MostrarInfo() {
	fmt.Println("Cafetería:", c.Nombre, "- Ubicación:", c.ubicacion, "- Empleados:", c.empleados)
}

// 2. Struct Restaurante
type Restaurante struct {
	Nombre     string   // Público
	tipoComida string   // Privado
	capacidad  int      // Privado
}

func (r Restaurante) MostrarDatos() {
	fmt.Println("Restaurante:", r.Nombre, "-", r.tipoComida, "-", r.capacidad)
}

// 3. Struct Libro
type Libro struct {
	Titulo string  // Público
	autor  string  // Privado
	isbn   string  // Privado
}

func (l Libro) MostrarDatos() {
	fmt.Println("Libro:", l.Titulo, "-", l.autor, "-", l.isbn)
}

// 4. Struct Vehiculo
type Vehiculo struct {
	Marca  string  // Público
	modelo string  // Privado
	valor  float64 // Privado
}

func (v Vehiculo) MostrarInfo() {
	fmt.Println("Vehículo:", v.Marca, "-", v.modelo, "-", v.valor)
}

// 5. Struct Estudiante
type Estudiante struct {
	Nombre  string // Público
	edad    int    // Privado
	carrera string // Privado
}

func (e Estudiante) MostrarDatos() {
	fmt.Println("Estudiante:", e.Nombre, "-", e.carrera, "-", e.edad)
}
