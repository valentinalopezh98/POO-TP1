package ar.edu.unlu.poo.estructuras;

public class ListaDoble {
    private NodoDoble inicio;
    private int cantidad;

    public void crearLista(){
        inicio = null;
        cantidad = 0;
    }

    public boolean esVacia(){
        return cantidad == 0;
    }

    public int longitud(){
        return cantidad;
    }

    public void agregar(Object dato){
        NodoDoble nuevoNodo = new NodoDoble();
        nuevoNodo.setDato(dato);
        if(cantidad == 0) {
            inicio = nuevoNodo;
        } else {
            NodoDoble nodoAux = inicio;
            while (nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(nodoAux);
        }
        cantidad++;
    }

    // Borra todas las repeticiones del dato pasado por parametro
    public void eliminar(Object dato){
        if (inicio != null){
            NodoDoble actual = inicio;
            while (actual != null && actual.getDato() == dato){ //borra las claves del inicio
                inicio = actual.getProximo();
                cantidad--;
                actual = inicio;
            }
            while (actual != null && actual.getProximo() != null){ //borra en el resto de la lista
                if (actual.getDato() == dato){
                    NodoDoble ant = actual.getAnterior();
                    NodoDoble prox = actual.getProximo();
                    ant.setProximo(prox);
                    prox.setAnterior(ant);
                    cantidad--;
                    actual = actual.getProximo();
                } else {
                    actual = actual.getProximo();
                }
            }
            if (actual.getProximo() == null && actual.getDato() == dato){
                NodoDoble ant = actual.getAnterior();
                ant.setProximo(null);
                cantidad--;
            }
        }
    }

    public Object buscar(Object dato){
        Object res= null;
        NodoDoble actual = inicio;
        while (actual != null){
            if (actual.getDato() == dato){
                res = dato;
            }
            actual = actual.getProximo();
        }
        return res;
    }

    public boolean insertar(Object dato, int pos){
        boolean res = true;
        if ((pos > cantidad) || (pos < 1)){
            res = false;
        } else {
            NodoDoble nuevoNodo = new NodoDoble();
            nuevoNodo.setDato(dato);
            if(pos == 1){
                nuevoNodo.setProximo(inicio);
                nuevoNodo.setAnterior(null);
                inicio = nuevoNodo;
            } else {
                NodoDoble temp = inicio;
                for (int i = 0; i < pos - 1; i++){
                    temp = temp.getProximo();
                }
                NodoDoble ant = temp.getAnterior();
                ant.setProximo(nuevoNodo);
                nuevoNodo.setProximo(temp);
                nuevoNodo.setAnterior(temp.getAnterior());
                temp.setAnterior(nuevoNodo);
            }
            cantidad++;
        }
        return res;
    }

    public String toString(){
        String acumulador = "";
        if (cantidad > 0){
            int i = 1;
            NodoDoble nodoAux = inicio;
            while (nodoAux != null){
                acumulador += "Nodo"+ i + ": " + nodoAux.getDato() + "\n";
                nodoAux = nodoAux.getProximo();
                i++;
            }
        } else acumulador = "La lista esta vacia";
        return acumulador;
    }
}


