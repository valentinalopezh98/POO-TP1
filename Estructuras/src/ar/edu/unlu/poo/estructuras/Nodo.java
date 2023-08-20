package ar.edu.unlu.poo.estructuras;

public class Nodo {
    private Object dato;
    private Nodo proximo = null;
    public void setDato(Object dato){
        this.dato = dato;
    }
    public Object getDato(){
        return dato;
    }
    public void setProximo(Nodo proximo){
        this.proximo = proximo;
    }
    public Nodo getProximo(){
        return proximo;
    }
}
