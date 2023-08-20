package ar.edu.unlu.poo.estructuras;

public class Cola {
    private Nodo frente;
    private Nodo fin;

    public void crear(){
        frente = null;
        fin = null;
    }

    public boolean esVacia(){
        return frente == null;
    }

    public void encolar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        nuevoNodo.setProximo(null);

        if (frente == null){
            frente = nuevoNodo;
        } else {
            fin.setProximo(nuevoNodo);
        }
        fin = nuevoNodo;
    }

    public Object desencolar(){
        if (frente == null){
            return null;
        }
        Nodo inicio = frente;
        Object elemento = inicio.getDato();
        frente = inicio.getProximo();

        return elemento;
    }

    public String toString(){
        String acumulador = "";
        if (frente != null){
            int i = 1;
            Nodo nodoAux = frente;
            Object dato = "";
            while (nodoAux != null){
                acumulador += "Nodo"+ i + ": " + nodoAux.getDato() + "\n";
                nodoAux = nodoAux.getProximo();
                i++;
            }
        } else acumulador = "La cola esta vacia";
        return acumulador;
    }
}
