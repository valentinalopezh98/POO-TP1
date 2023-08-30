package ar.edu.unlu.poo.tp1.libro;

public class Libro {
    private String nombre;
    private String autor;
    private String ISBN;
    private int cantidadPaginas;
    private int cantidadTotalEjemplares;
    private int cantidadPrestados = 0;

    public Libro(String nombre, String autor, String ISBN, int cantidadPaginas, int cantidadEjemplares){
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantidadPaginas = cantidadPaginas;
        this.cantidadTotalEjemplares = cantidadEjemplares;
    }

    public Libro(String nombre, String autor, int cantidadPaginas, int cantidadEjemplares){
        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = null;
        this.cantidadPaginas = cantidadPaginas;
        this.cantidadTotalEjemplares = cantidadEjemplares;
    }

    public String toString(){
        return "El libro \u001B[36m" + nombre + "\u001B[0m creado por el autor \u001B[36m" + autor +
                "\u001B[0m tiene \u001B[36m" + cantidadPaginas + "\u001B[0m páginas, quedan \u001B[36m" +
                getCantidadEjemplares() + "\u001B[0m ejemplares disponibles y se prestaron \u001B[36m" +
                cantidadPrestados + "\u001B[0m ejemplares";
    }

    public int getCantidadDisponibles(){
        return (cantidadTotalEjemplares - cantidadPrestados);
    }

    public int getCantidadPrestados(){
        return cantidadPrestados;
    }

    public int getCantidadEjemplares() {
        return cantidadTotalEjemplares;
    }

    public int getCantidadPaginas(){
        return cantidadPaginas;
    }
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void agregarEjemplares(int cantidadNuevosEjemplares){
        cantidadTotalEjemplares += cantidadNuevosEjemplares;
    }

    public boolean prestarLibro(){
        boolean sePuedePrestar = false;
        if (getCantidadDisponibles() > 1){
            cantidadPrestados++;
            sePuedePrestar = true;
        }
        return sePuedePrestar;
    }

    public boolean devolverLibro(){
        boolean seDevuelve = false;
        if (cantidadPrestados > 0){
            cantidadPrestados--;
            seDevuelve = true;
        }
        return seDevuelve;
    }

}
