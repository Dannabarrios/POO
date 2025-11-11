using System;

// 1. Clase Cafeteria
class Cafeteria
{
    public string Nombre;
    public string Ubicacion;
    public int Empleados;

    public void Abrir() { Console.WriteLine("La cafetería está abierta."); }
    public void Cerrar() { Console.WriteLine("La cafetería ha cerrado."); }
    public void MostrarInfo() { Console.WriteLine("Nombre: " + Nombre + ", Ubicación: " + Ubicacion + ", Empleados: " + Empleados); }
}

// 2. Clase Restaurante
class Restaurante
{
    private string nombre = "El Buen Sabor";
    private string tipoComida = "Comida típica";
    private int capacidad = 50;

    public void MostrarDatos() { Console.WriteLine("Restaurante: " + nombre + " - Tipo: " + tipoComida + " - Capacidad: " + capacidad); }
    public void Abrir() { Console.WriteLine("El restaurante ha abierto sus puertas."); }
    public void Cerrar() { Console.WriteLine("El restaurante ha cerrado por hoy."); }
}

// 3. Clase Libro
class Libro
{
    public string Titulo;
    public string Autor;
    public int Paginas;

    public void Leer() { Console.WriteLine("Leyendo el libro '" + Titulo + "' de " + Autor); }
    public void MarcarPagina(int pagina) { Console.WriteLine("Marcando la página " + pagina + " de " + Titulo); }
}

// 4. Clase Vehiculo
class Vehiculo
{
    private string marca = "Toyota";
    private string modelo = "Hilux";
    private int año = 2022;

    public void Encender() { Console.WriteLine("El vehículo ha sido encendido."); }
    public void Apagar() { Console.WriteLine("El vehículo ha sido apagado."); }
    public void MostrarInfo() { Console.WriteLine("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año); }
}

// 5. Clase Estudiante
class Estudiante
{
    private string nombre;
    private int edad;
    public string Carrera;

    public Estudiante(string nombre, int edad, string carrera)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.Carrera = carrera;
    }

    public void Presentarse() { Console.WriteLine("Hola, soy " + nombre + " y estudio " + Carrera); }
    public void CumplirAños() { edad++; Console.WriteLine(nombre + " ahora tiene " + edad + " años."); }
}
