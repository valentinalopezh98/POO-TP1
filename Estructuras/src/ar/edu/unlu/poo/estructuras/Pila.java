package ar.edu.unlu.poo.estructuras;

public class Pila {
    private Nodo tope;

    public void crear(){
        tope = null;
    }

    public Object tope(){
        return tope.getDato();
    }

    public boolean esVacia(){
        return tope == null;
    }

    public void apilar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        nuevoNodo.setProximo(this.tope);
        this.tope = nuevoNodo;
    }

    public Object desapilar(){
        Nodo topeActual = tope;
        Object dato = topeActual.getDato();
        tope = topeActual.getProximo();
        return dato;
    }

    public String toString(){
        String acumulador = "";
        if (tope != null){
            int i = 1;
            Nodo nodoAux = tope;
            Object dato = "";
            while (nodoAux != null){
                acumulador += "Nodo"+ i + ": " + nodoAux.getDato() + "\n";
                nodoAux = nodoAux.getProximo();
                i++;
            }
        } else acumulador = "La pila esta vacia";
        return acumulador;
    }
}
