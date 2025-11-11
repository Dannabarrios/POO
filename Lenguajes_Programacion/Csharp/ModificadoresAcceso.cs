using System;

// 1. Clase Cafeteria
class Cafeteria
{
    public string Nombre = "El Tomo Café";       // público
    private string ContraseñaWifi = "Cafe123";   // privado
    protected int Empleados = 5;                 // protegido

    public void MostrarInfo()
    {
        Console.WriteLine("Cafetería: " + Nombre);
        Console.WriteLine("Empleados (protegido): " + Empleados);
    }
}

// 2. Clase Restaurante
class Restaurante
{
    public string Nombre = "La Fogata";          // público
    private double VentasDelDía = 1250000;       // privado
    protected string TipoComida = "Asados";      // protegido

    public void MostrarDatos()
    {
        Console.WriteLine("Restaurante: " + Nombre);
        Console.WriteLine("Tipo de comida (protegido): " + TipoComida);
        Console.WriteLine("Ventas del día (privado, solo aquí): $" + VentasDelDía);
    }
}

// 3. Clase Libro
class Libro
{
    public string Titulo = "El café del alma";   // público
    private string ISBN = "978-958-1234567";     // privado
    protected string Autor = "Andrés Barrios";   // protegido

    public void MostrarDatos()
    {
        Console.WriteLine("Título: " + Titulo);
        Console.WriteLine("Autor (protegido): " + Autor);
        Console.WriteLine("ISBN (privado): " + ISBN);
    }
}

// 4. Clase Vehiculo
class Vehiculo
{
    public string Marca = "Toyota";              // público
    private double Valor = 95000000;             // privado
    protected string Propietario = "Valentina";  // protegido

    public void MostrarInfo()
    {
        Console.WriteLine("Marca: " + Marca);
        Console.WriteLine("Propietario (protegido): " + Propietario);
        Console.WriteLine("Valor (privado): $" + Valor);
    }
}

// 5. Clase Estudiante
class Estudiante
{
    public string Nombre = "Camila";             // público
    private int Edad = 21;                       // privado
    protected string Carrera = "Ingeniería";     // protegido

    public void MostrarDatos()
    {
        Console.WriteLine("Estudiante: " + Nombre);
        Console.WriteLine("Carrera (protegida): " + Carrera);
        Console.WriteLine("Edad (privada): " + Edad);
    }
}
