package ar.edu.unlu.poo.tp1.tarea;

import java.util.ArrayList;

public class Colaborador {
    private ArrayList<Tarea> tareasRealizadas = new ArrayList<>();
    private String nombre;

    public Colaborador(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Tarea> getTareas() {
        return tareasRealizadas;
    }

    public void realizarTarea(Tarea tarea){
        tareasRealizadas.add(tarea);
    }

    @Override
    public String toString() {
        String acc = "\u001B[35mTAREAS REALIZADAS POR "+ getNombre().toUpperCase() +"\u001B[0m \n";
        for (Tarea tarea : tareasRealizadas) {
            acc += tarea.toString() + " (" + tarea.getFechaFinalizacion() + ")\n";
        }
        return acc;
    }
}
