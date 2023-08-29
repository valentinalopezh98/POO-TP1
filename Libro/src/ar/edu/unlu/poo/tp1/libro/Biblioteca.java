package ar.edu.unlu.poo.tp1.libro;

import java.util.ArrayList;

public class Biblioteca {
    public enum Busqueda {TITULO, AUTOR, ISBN}
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(String titulo, String autor, int cantidadPaginas, int cantidadEjemplares){
        Libro libro = new Libro(titulo,autor,cantidadPaginas,cantidadEjemplares);
        libros.add(libro);
    }

    private Libro buscarLibro(String nombre, Busqueda parametroDeBusqueda){
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

    public boolean prestarLibro(String nombre,Busqueda parametroBusqueda){
        Libro libro = buscarLibro(nombre, parametroBusqueda);
        if(libro != null){
            return libro.prestarLibro();
        }
        return false;
    }

    public boolean devolverLibro(String nombre,Busqueda parametroBusqueda){
        Libro libro = buscarLibro(nombre, parametroBusqueda);
        if(libro != null){
            return libro.devolverLibro();
        }
        return false;
    }

    public boolean agregarEjemplares(String nombre,Busqueda parametroBusqueda,int cantidad){
        Libro libro = buscarLibro(nombre, parametroBusqueda);
        if(libro != null){
            libro.agregarEjemplares(cantidad);
            return true;
        }
        return false;
    }

    public String mostrarDescripcion(String nombre,Busqueda parametroBusqueda){
        Libro libro = buscarLibro(nombre, parametroBusqueda);
        if(libro != null){
            return libro.descripcion();
        }
        return "No se encontró el libro";
    }

    public int cantidadPrestados(String nombre,Busqueda parametroBusqueda){
        Libro libro = buscarLibro(nombre, parametroBusqueda);
        if(libro != null){
            return libro.getCantidadPrestados();
        }
        return -1;
    }

    public int cantidadDePaginas(String nombre,Busqueda parametroBusqueda){
        Libro libro = buscarLibro(nombre, parametroBusqueda);
        if(libro != null){
            return libro.getCantidadPaginas();
        }
        return -1;
    }



}
