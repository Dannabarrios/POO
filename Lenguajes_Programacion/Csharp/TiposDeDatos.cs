using System;

// Programa principal
class Program
{
    static void Main()
    {
        // 1. Tipo de dato string
        string nombre = "El Tomo Café";
        string ubicacion = "Teruel, Huila";
        Console.WriteLine("Cafetería: " + nombre + " - Ubicación: " + ubicacion);

        // 2. Tipo de dato int
        int empleados = 5;
        int mesas = 10;
        Console.WriteLine("Número de empleados: " + empleados);
        Console.WriteLine("Número de mesas: " + mesas);

        // 3. Tipo de dato double
        double precioCafe = 6.5;
        double precioCapuccino = 8.0;
        Console.WriteLine("Precio del café: $" + precioCafe);
        Console.WriteLine("Precio del capuccino: $" + precioCapuccino);

        // 4. Tipo de dato bool
        bool abierta = true;
        Console.WriteLine("¿La cafetería está abierta? " + abierta);

        // 5. Tipo de dato char
        char categoria = 'A';
        Console.WriteLine("Categoría del local: " + categoria);

        // 6. Combinando diferentes tipos
        string resumen = $"El local {nombre} tiene {mesas} mesas y {empleados} empleados. Categoría: {categoria}.";
        Console.WriteLine(resumen);
    }
}
