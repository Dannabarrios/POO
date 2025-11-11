public class Main {
    public static void main(String[] args) {

        Cafeteria cafe = new Cafeteria();
        cafe.nombre = "El Tomo Café";
        cafe.ubicacion = "Teruel, Huila";
        cafe.empleados = 5;

        Restaurante rest = new Restaurante();
        rest.nombre = "La Fogata";
        rest.tipoComida = "Asados";
        rest.capacidad = 80;

        Libro libro = new Libro();
        libro.titulo = "El café del alma";
        libro.autor = "Andrés Barrios";
        libro.paginas = 210;

        Vehiculo carro = new Vehiculo();
        carro.marca = "Toyota";
        carro.modelo = "Hilux";
        carro.año = 2022;

        Estudiante est = new Estudiante();
        est.nombre = "Camila";
        est.edad = 21;
        est.carrera = "Ingeniería de Software";

        System.out.println(cafe.nombre + " - " + cafe.ubicacion);
        System.out.println(rest.nombre + " - " + rest.tipoComida);
        System.out.println(libro.titulo + " - " + libro.autor);
        System.out.println(carro.marca + " " + carro.modelo);
        System.out.println(est.nombre + " - " + est.carrera);
    }
}
