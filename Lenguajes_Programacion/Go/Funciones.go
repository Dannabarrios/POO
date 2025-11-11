package main

// 1. Struct Cafeteria
type Cafeteria struct{}

func (Cafeteria) CalcularIngreso(precio float64, ventas int) float64 {
	return precio * float64(ventas)
}

// 2. Struct Restaurante
type Restaurante struct{}

func (Restaurante) CalcularCuenta(precioPlato float64, cantidad int) float64 {
	return precioPlato * float64(cantidad)
}

// 3. Struct Libro
type Libro struct{}

func (Libro) PaginasRestantes(total, leidas int) int {
	return total - leidas
}

// 4. Struct Vehiculo
type Vehiculo struct{}

func (Vehiculo) RequiereMantenimiento(km int) bool {
	return km >= 10000
}

// 5. Struct Estudiante
type Estudiante struct{}

func (Estudiante) Aprobado(promedio float64) bool {
	return promedio >= 3.0
}
