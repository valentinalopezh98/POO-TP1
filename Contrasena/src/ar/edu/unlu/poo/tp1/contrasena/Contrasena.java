package ar.edu.unlu.poo.tp1.contrasena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Contrasena {
    private int longitud;
    private String contrasena;
    private ArrayList<Character> charList = new ArrayList<>();

    //Constructor si ingresan longitud
    public Contrasena(int longitud){
        this.longitud = longitud;
        setCharList();
        contrasena = generarContrasena(longitud);
    }

    //Constructor con longitud por defecto
    public Contrasena(){
        longitud = 8;
        setCharList();
        contrasena = generarContrasena(longitud);
    }

    //getters y setters necesarios
    public String getContrasena() {
        return contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //Arma el ArrayList con todos los valores posibles para la contrasena
    private void setCharList(){
        // Agregar letras minúsculas
        for (char ch = 'a'; ch <= 'z'; ch++) {
            charList.add(ch);
        }

        // Agregar letras mayúsculas
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            charList.add(ch);
        }

        // Agregar números del 0 al 9
        for (char ch = '0'; ch <= '9'; ch++) {
            charList.add(ch);
        }
    }

    //Genera contrasenas con la longitud pasada por parametro
    private String generarContrasena(int longitud){
        Random random = new Random();
        String acumulador = "";
        for (int i = 0; i < longitud; i++){
            int randomIndex = random.nextInt(charList.size());
            acumulador += charList.get(randomIndex);
        }
        contrasena = acumulador;
       return acumulador;
    }

    //Verifica si la contrasena es segura o no
    public boolean esSegura(){
        int cantidadMayus = 0;
        int cantidadMin = 0;
        int cantidadNumeros = 0;
        for (int i = 0; i < contrasena.length(); i++){
            if (contrasena.charAt(i) > 'A' && contrasena.charAt(i) < 'Z'){
                cantidadMayus++;
            } else if (contrasena.charAt(i) > 'a' && contrasena.charAt(i) < 'z') {
                cantidadMin++;
            } else {
                cantidadNumeros++;
            }
        }
        if (cantidadMayus > 2 && cantidadMin > 1 && cantidadNumeros >= 2){
            return true;
        }
        return false;
    }


}
