package ar.edu.unlu.poo.estructuras;

public class Lista {
    private Nodo inicio;

    private int cantidad;

    public void crearLista(){
        cantidad = 0;
        inicio = null;
    }

    public boolean esVacia(){
        return cantidad == 0;
    }

    public int longitud(){
        return cantidad;
    }

    // agrega el dato al final de la lista
    public void agregar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if(cantidad == 0) {
            inicio = nuevoNodo;
        } else {
            Nodo nodoAux = inicio;
            while (nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
        }
        cantidad++;
    }

    // inserta el dato en la posicion logica pasada por parametro
    public boolean insertar(Object dato, int pos){
        boolean res = true;
        if ((pos > cantidad) || (pos < 1)){
            res = false;
        } else {
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.setDato(dato);
            if(pos == 1){
                nuevoNodo.setProximo(inicio);
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                for (int i = 0; i < pos - 2; i++){
                    temp = temp.getProximo();
                }
                nuevoNodo.setProximo(temp.getProximo());
                temp.setProximo(nuevoNodo);
            }
            cantidad++;
        }
        return res;
    }

    // Busca el dato pasado por parametro y lo devuelve
    public Object buscar(Object dato){
        Object res= null;
        Nodo actual = inicio;
        while (actual != null){
            if (actual.getDato() == dato){
                res = dato;
            }
            actual = actual.getProximo();
        }
        return res;
    }

     // Borra todas las repeticiones del dato pasado por parametro
    public void eliminar(Object dato){
        if (inicio != null){
            Nodo actual = inicio;
            while (actual != null && actual.getDato() == dato){ //borra las claves del inicio
              inicio = actual.getProximo();
              cantidad--;
              actual = inicio;
            }
            while (actual != null && actual.getProximo() != null){ //borra en el resto de la lista
                if (actual.getProximo().getDato() == dato){
                    Nodo temp = actual.getProximo();
                    actual.setProximo(temp.getProximo());
                    cantidad--;
                } else {
                    actual = actual.getProximo();
                }
            }
        }
    }

    public String toString(){
        String acumulador = "";
        if (cantidad > 0){
            int i = 1;
            Nodo nodoAux = inicio;
            while (nodoAux != null){
                acumulador += "Nodo"+ i + ": " + nodoAux.getDato() + "\n";
                nodoAux = nodoAux.getProximo();
                i++;
            }
        } else acumulador = "La lista esta vacia";
        return acumulador;
    }
}
