package ar.edu.unlu.poo.tp1.juego;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int puntos;
    private ArrayList<String> palabras = new ArrayList<>();

    public Jugador(String nombre){
        this.nombre = nombre;
        puntos = 0;
    }

    public int getPuntos(){
        return puntos;
    }

    public String getNombre(){
        return nombre;
    }

    public ArrayList<String> getPalabras(){
        return palabras;
    }

    public boolean agregarPalabra(String palabra){
        boolean esValida = true;
        palabras.add(palabra);
        puntos = calcularPuntos(palabra);
        return esValida;
    }

    private int calcularPuntos(String palabra){
        int puntosExtra = 0;
        for (int i = 0; i < palabra.length(); i++){
            if ((palabra.charAt(i) == 'k') ||
                    (palabra.charAt(i) == 'z') ||
                    (palabra.charAt(i) == 'x') ||
                    (palabra.charAt(i) == 'y') ||
                    (palabra.charAt(i) == 'w') ||
                    (palabra.charAt(i) == 'q')){
                    puntosExtra++;
            }
        }
        return palabra.length() + puntosExtra + puntos;
    }
}
