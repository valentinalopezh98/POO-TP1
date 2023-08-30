package ar.edu.unlu.poo.tp1.libro;

import java.util.ArrayList;

public class Biblioteca {
    public enum Busqueda {TITULO, AUTOR, ISBN}
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(String titulo, String autor, int cantidadPaginas, int cantidadEjemplares){
        Libro libro = new Libro(titulo,autor,cantidadPaginas,cantidadEjemplares);
        libros.add(libro);
    }

    public Libro buscarLibro(String nombre, Busqueda parametroDeBusqueda){
        for(Libro libro : libros){
            if (parametroDeBusqueda == Busqueda.TITULO){
                if(libro.getNombre().equals(nombre))
                    return libro;
            }
            if (parametroDeBusqueda == Busqueda.AUTOR){
                if(libro.getAutor().equals(nombre))
                    return libro;
            }
            if (parametroDeBusqueda == Busqueda.ISBN){
                if(libro.getISBN().equals(nombre))
                    return libro;
            }
        }
        return null;
    }

    public boolean prestarLibro(Libro l){
        for (Libro libro : libros){
            if (libro.getNombre().equals(l.getNombre())){
                return libro.prestarLibro();
            }
        }
        return false;
    }

    public boolean devolverLibro(Libro l){
        for (Libro libro : libros){
            if (libro.getNombre().equals(l.getNombre())){
                return libro.devolverLibro();
            }
        }
        return false;
    }

    public void agregarEjemplares(Libro l, int cantidad){
        for (Libro libro : libros){
            if (libro.getNombre().equals(l.getNombre())){
                libro.agregarEjemplares(cantidad);
            }
        }
    }

    public int cantidadTotalPrestados(){
        int contador = 0;
        for (Libro libro : libros){
           contador += libro.getCantidadPrestados();
        }
        return contador;
    }

}
