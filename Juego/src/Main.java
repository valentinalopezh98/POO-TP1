import ar.edu.unlu.poo.tp1.juego.Diccionario;
import ar.edu.unlu.poo.tp1.juego.Juego;

public class Main {
    public static void main(String[] args) {
        //Se crea el diccionario y se agregan palabras
        Diccionario diccionario = new Diccionario();
        diccionario.agregarPalabra("experimento");
        diccionario.agregarPalabra("queso");
        diccionario.agregarPalabra("kiosco");
        Juego juego = new Juego(diccionario);
        diccionario.agregarPalabra("casa");
        diccionario.agregarPalabra("mosca");

        //Se crean dos jugadores
        juego.agregarJugador("jugador 1");
        juego.agregarJugador("jugador 2");

        //Jugadas de cada jugador
        //Deberia tener 18 puntos porque asdasd no existe en el diccionario
        juego.probarPalabra("experimento","jugador 1");
        juego.probarPalabra("asdasd","jugador 1");
        juego.probarPalabra("queso","jugador 1");

        //Deberia tener 16 puntos
        juego.probarPalabra("casa","jugador 2");
        juego.probarPalabra("kiosco","jugador 2");
        juego.probarPalabra("mosca","jugador 2");

        //Se muestran los puntos de cada uno
        System.out.println("Puntaje jugador 1: " + juego.getPuntajeTotal("jugador 1"));
        System.out.println("Puntaje jugador 2: " + juego.getPuntajeTotal("jugador 2"));
        System.out.println(juego.puntajeMasAlto());
    }
}