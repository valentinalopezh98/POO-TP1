import ar.edu.unlu.poo.tp1.libro.Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Catedrales", "Claudia Pineiro", 336, 10);
        Libro libro2 = new Libro("El último regalo", "Sebastian Fitzek", 400, 1);

        System.out.println(libro1.descripcion());
        System.out.println(libro2.descripcion());
        System.out.println("El libro con mas páginas es " +
                (libro1.getCantidadPaginas() > libro2.getCantidadPaginas() ? libro1.getNombre() : libro2.getNombre())
        );

        System.out.println(libro1.prestarLibro() ?
                "Se  pudo prestar un ejemplar de " + libro1.getNombre()  :
                "No se pudo prestar el libro" + libro1.getNombre()
        );

        System.out.println(libro2.prestarLibro() ?
                "Se  pudo prestar un ejemplar de " + libro2.getNombre() :
                "No se pudo prestar el libro " + libro2.getNombre()
        );

        System.out.println("La cantidad total de prestamos de " + libro1.getNombre() + " es: " + libro1.getCantidadPrestados());
        System.out.println("La cantidad total de prestamos de " + libro2.getNombre() + " es: " + libro2.getCantidadPrestados());
    }
}