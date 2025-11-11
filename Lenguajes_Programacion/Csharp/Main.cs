// Programa principal
class Program
{
    static void Main()
    {
        // 1. Objeto Cafeteria
        Cafeteria cafeteria1 = new Cafeteria { Nombre = "El Tomo Café", Ubicacion = "Teruel, Huila", Empleados = 5 };

        // 2. Objeto Restaurante
        Restaurante restaurante1 = new Restaurante { Nombre = "La Fogata", TipoComida = "Asados", Capacidad = 80 };

        // 3. Objeto Libro
        Libro libro1 = new Libro { Titulo = "El café del alma", Autor = "Andrés Barrios", Paginas = 210 };

        // 4. Objeto Vehiculo
        Vehiculo vehiculo1 = new Vehiculo { Marca = "Toyota", Modelo = "Hilux", Año = 2022 };

        // 5. Objeto Estudiante
        Estudiante estudiante1 = new Estudiante { Nombre = "Camila", Edad = 21, Carrera = "Ingeniería de Software" };

        // Mostrar los datos
        Console.WriteLine("Cafetería: " + cafeteria1.Nombre + " - Ubicación: " + cafeteria1.Ubicacion + " - Empleados: " + cafeteria1.Empleados);
        Console.WriteLine("Restaurante: " + restaurante1.Nombre + " - Tipo: " + restaurante1.TipoComida + " - Capacidad: " + restaurante1.Capacidad);
        Console.WriteLine("Libro: " + libro1.Titulo + " - Autor: " + libro1.Autor);
        Console.WriteLine("Vehículo: " + vehiculo1.Marca + " " + vehiculo1.Modelo + " - Año: " + vehiculo1.Año);
        Console.WriteLine("Estudiante: " + estudiante1.Nombre + " - Edad: " + estudiante1.Edad + " - Carrera: " + estudiante1.Carrera);


        // 1. Funciones Cafeteria
        Cafeteria1 cafeteria1 = new Cafeteria1();
        Console.WriteLine("Ingreso diario: $" + cafe.CalcularIngreso(6.5, 40));
        Console.WriteLine("¿Está abierta a las 8am?: " + cafe.EstaAbierta(8));

        // 2. Funciones Restaurante
        Restaurante restaurante = new Restaurante();
        Console.WriteLine("Total cuenta: $" + restaurante.CalcularCuenta(25000, 3));
        Console.WriteLine(restaurante.ObtenerTipoComida("Asados"));

        // 3. Funciones Libro
        Libro libro = new Libro();
        Console.WriteLine("Páginas restantes: " + libro.CalcularPaginasRestantes(120, 210));
        Console.WriteLine(libro.ObtenerAutor("El café del alma"));

        // 4. Funciones Vehiculo
        Vehiculo carro = new Vehiculo();
        Console.WriteLine("Costo del viaje: $" + carro.CalcularCostoViaje(150, 0.08, 11000));
        Console.WriteLine("¿Requiere mantenimiento?: " + carro.RequiereMantenimiento(12000));

        // 5. Funciones Estudiante
        Estudiante estudiante = new Estudiante();
        double promedio = estudiante.CalcularPromedio(4.5, 3.8, 4.2);
        Console.WriteLine("Promedio del estudiante: " + promedio);
        Console.WriteLine("¿Aprobado?: " + estudiante.Aprobado(promedio));
    }
}
    