package ar.edu.unlu.poo.tp1.juego;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    public void agregarJugador(String nombre){
        Jugador jugador = new Jugador(nombre);
        jugadores.add(jugador);
    }
    public String puntajeMasAlto(){
        int mayor;
        String nombre;
        if (jugadores.isEmpty()){
            return null;
        } else {
            mayor = jugadores.get(0).getPuntos();
            nombre = jugadores.get(0).getNombre();
            for (Jugador jugador : jugadores) {
                if (jugador.getPuntos() > mayor) {
                    mayor = jugador.getPuntos();
                    nombre = jugador.getNombre();
                }
            }
        }

        return "El jugador con mas puntos es " + nombre + " con " +
                mayor + " puntos";
    }

    public void agregarPalabra(String palabra, String nombre){
        for (Jugador jugador : jugadores){
            if(jugador.getNombre().equals(nombre)){
                jugador.agregarPalabra(palabra);
            }
        }
    }

    public int getPuntajeTotal(String nombreJugador){
        for (Jugador jugador : jugadores){
            if (jugador.getNombre().equals(nombreJugador)){
                return jugador.getPuntos();
            }
        }
        return 0;
    }
}
