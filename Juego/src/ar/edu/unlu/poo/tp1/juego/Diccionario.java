package ar.edu.unlu.poo.tp1.juego;

import java.util.ArrayList;

public class Diccionario {
    private static ArrayList<String> palabrasValidas = new ArrayList<>();

    public void agregarPalabra(String palabra){
        palabrasValidas.add(palabra);
    }

    public boolean esValida(String palabra){
        for (String palabraValida : palabrasValidas){
            if (palabraValida.equals(palabra))
                return true;
        }
        return false;
    }


}
