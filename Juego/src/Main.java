import ar.edu.unlu.poo.tp1.juego.Juego;

public class Main {
    public static void main(String[] args) {

        Juego juego = new Juego();
        //Se crean dos jugadores
        juego.agregarJugador("jugador 1");
        juego.agregarJugador("jugador 2");

        //Jugadas de cada jugador
        juego.agregarPalabra("experimento","jugador 1");
        juego.agregarPalabra("casa","jugador 2");
        juego.agregarPalabra("queso","jugador 1");
        juego.agregarPalabra("kiosco","jugador 2");

        //Se muestran los puntos de cada uno
        System.out.println("Puntaje jugador 1: " + juego.getPuntajeTotal("jugador 1"));
        System.out.println("Puntaje jugador 2: " + juego.getPuntajeTotal("jugador 2"));
        System.out.println(juego.puntajeMasAlto());
    }
}