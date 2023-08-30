import ar.edu.unlu.poo.tp1.libro.Biblioteca;
import ar.edu.unlu.poo.tp1.libro.Libro;

public class Main {
    public static void main(String[] args) {
        //Creo la clase biblioteca
        Biblioteca biblioteca = new Biblioteca();
        //Agrego dos libros a la biblioteca
        biblioteca.agregarLibro("Catedrales", "Claudia Pineiro", 336, 10);
        biblioteca.agregarLibro("El ultimo regalo", "Sebastian Fitzek", 400, 1);
        //Muestro los libros
        Libro libro1 = biblioteca.buscarLibro("Catedrales", Biblioteca.Busqueda.TITULO);
        System.out.println(libro1);
        Libro libro2 = biblioteca.buscarLibro("Sebastian Fitzek", Biblioteca.Busqueda.AUTOR);
        System.out.println(libro2);


        System.out.println("El libro con mas páginas es " +
                (libro1.getCantidadPaginas() > libro2.getCantidadPaginas() ?
                        "Catedrales" : "El ultimo regalo")
        );

        System.out.println(biblioteca.prestarLibro(libro1) ?
                "Se  pudo prestar un ejemplar de Catedrales" :
                "No se pudo prestar Catedrales"
        );

        System.out.println(biblioteca.prestarLibro(libro2) ?
                "Se  pudo prestar un ejemplar de El ultimo regalo" :
                "No se pudo prestar El ultimo regalo"
        );

        System.out.println("La cantidad total de prestamos es: " +
                biblioteca.cantidadTotalPrestados());
    }
}