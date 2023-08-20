package ar.edu.unlu.poo.estructuras;

public class NodoDoble {
    private Object dato;
    private NodoDoble anterior = null;
    private NodoDoble proximo = null;
    public void setDato(Object dato){this.dato = dato;}
    public Object getDato(){
        return dato;
    }
    public void setAnterior(NodoDoble anterior){this.anterior = anterior;}
    public NodoDoble getAnterior(){ return anterior;}
    public void setProximo(NodoDoble proximo){
        this.proximo = proximo;
    }
    public NodoDoble getProximo(){
        return proximo;
    }}
