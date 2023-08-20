import ar.edu.unlu.poo.estructuras.Cola;
import ar.edu.unlu.poo.estructuras.Lista;
import ar.edu.unlu.poo.estructuras.ListaDoble;
import ar.edu.unlu.poo.estructuras.Pila;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[36m" + "PRUEBA DE LISTA SIMPLEMENTE ENLAZADA" + "\u001B[0m");
        Lista lista = new Lista();
        lista.crearLista();
        lista.agregar("a");
        lista.agregar("a");
        lista.agregar("b");
        lista.agregar("c");
        lista.agregar("a");
        lista.agregar("d");
        System.out.println("Lista original: \n" + lista);
        lista.insertar("v",3);
        System.out.println("Lista luego de insertar v en la pos 3: \n" + lista);
        System.out.println("Buscar z es: " + lista.buscar("z"));
        System.out.println("Buscar a es: " + lista.buscar("a")+ "\n");
        System.out.println("Cantidad de elementos: " + lista.longitud());
        lista.eliminar("a");
        System.out.println("Lista luego de eliminar a: \n" + lista);
        System.out.println("Cantidad de elementos: " + lista.longitud());


        System.out.println("\u001B[36m" + "PRUEBA DE LISTA DOBLEMENTE ENLAZADA" + "\u001B[0m");
        ListaDoble listadoble = new ListaDoble();
        listadoble.crearLista();
        listadoble.agregar("a");
        listadoble.agregar("a");
        listadoble.agregar("d");
        listadoble.agregar("e");
        listadoble.agregar("a");
        listadoble.agregar("f");
        listadoble.agregar("a");
        System.out.println("Lista Doble luego de agregar a,a,d,e,a,f,a: \n"+ listadoble);
        listadoble.eliminar("a");
        System.out.println("Lista Doble luego de borrar a: \n"+ listadoble);
        listadoble.insertar("j",3);
        System.out.println("Lista Doble luego de insertar j en la posicion 3: \n"+ listadoble);


        System.out.println("\u001B[36m" + "PRUEBA DE PILA" + "\u001B[0m");
        Pila pila = new Pila();
        pila.crear();
        pila.apilar("1");
        pila.apilar("2");
        pila.apilar("3");
        System.out.println("Pila luego de apilar 1,2,3: \n" + pila);
        System.out.println(pila);
        System.out.println("Pila despues de desapilar:  ");
        pila.desapilar();
        System.out.println(pila);

        System.out.println("\u001B[36m" + "PRUEBA DE COLA" + "\u001B[0m");
        Cola cola = new Cola();
        cola.crear();
        cola.encolar("1");
        cola.encolar("2");
        cola.encolar("3");
        System.out.println("Cola luego de encolar 1,2,3: \n" + cola);
        cola.desencolar();
        System.out.println("Cola luego de desencolar: \n" + cola);

    }
}