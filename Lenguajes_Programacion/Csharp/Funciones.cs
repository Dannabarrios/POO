using System;

// 1. Clase Cafeteria
class Cafeteria
{
    public double CalcularIngreso(double precioPromedio, int ventasDia)
    {
        double ingreso = precioPromedio * ventasDia;
        return ingreso;
    }

    public bool EstaAbierta(int hora)
    {
        return hora >= 7 && hora <= 18;
    }
}

// 2. Clase Restaurante
class Restaurante
{
    public double CalcularCuenta(double precioPlato, int cantidad)
    {
        return precioPlato * cantidad;
    }

    public string ObtenerTipoComida(string tipo)
    {
        return "Tipo de comida: " + tipo;
    }
}

// 3. Clase Libro
class Libro
{
    public int CalcularPaginasRestantes(int paginaActual, int totalPaginas)
    {
        return totalPaginas - paginaActual;
    }

    public string ObtenerAutor(string titulo)
    {
        if (titulo == "El café del alma")
            return "Autor: Andrés Barrios";
        else
            return "Autor desconocido";
    }
}

// 4. Clase Vehiculo
class Vehiculo
{
    public double CalcularCostoViaje(double distancia, double consumoPorKm, double precioCombustible)
    {
        double litrosUsados = distancia * consumoPorKm;
        double costo = litrosUsados * precioCombustible;
        return costo;
    }

    public bool RequiereMantenimiento(int kilometros)
    {
        return kilometros >= 10000;
    }
}

// 5. Clase Estudiante
class Estudiante
{
    public double CalcularPromedio(double nota1, double nota2, double nota3)
    {
        return (nota1 + nota2 + nota3) / 3;
    }

    public bool Aprobado(double promedio)
    {
        return promedio >= 3.0;
    }
}
