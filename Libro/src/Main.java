import ar.edu.unlu.poo.tp1.libro.Biblioteca;
import ar.edu.unlu.poo.tp1.libro.Libro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("Catedrales", "Claudia Pineiro", 336, 10);
        biblioteca.agregarLibro("El ultimo regalo", "Sebastian Fitzek", 400, 1);

        System.out.println(biblioteca.mostrarDescripcion("Catedrales", Biblioteca.Busqueda.TITULO));
        System.out.println(biblioteca.mostrarDescripcion("Sebastian Fitzek", Biblioteca.Busqueda.AUTOR));
        System.out.println("El libro con mas páginas es " +
                (biblioteca.cantidadDePaginas("Catedrales", Biblioteca.Busqueda.TITULO) >
                        biblioteca.cantidadDePaginas("El ultimo regalo", Biblioteca.Busqueda.TITULO) ?
                            "Catedrales" : "El ultimo regalo")
        );

        System.out.println(biblioteca.prestarLibro("Catedrales", Biblioteca.Busqueda.TITULO) ?
                "Se  pudo prestar un ejemplar de Catedrales"  :
                "No se pudo prestar Catedrales"
        );

        System.out.println(biblioteca.prestarLibro("El ultimo regalo", Biblioteca.Busqueda.TITULO) ?
                "Se  pudo prestar un ejemplar de El ultimo regalo" :
                "No se pudo prestar El ultimo regalo"
        );

        System.out.println("La cantidad total de prestamos de Catedrales es: " +
                biblioteca.cantidadPrestados("Catedrales", Biblioteca.Busqueda.TITULO));
        System.out.println("La cantidad total de prestamos de El ultimo regalo es: " +
                biblioteca.cantidadPrestados("El ultimo regalo", Biblioteca.Busqueda.TITULO));
    }
}