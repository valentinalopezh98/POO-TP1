package ar.edu.unlu.poo.tp1.tarea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaDeTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();
    private ArrayList<Colaborador> colaboradores = new ArrayList<>();

    public void agregarTarea(String descripcion, Tarea.Prioridad prioridad) {
        Tarea tarea = new Tarea(descripcion, prioridad);
        tareas.add(tarea);
    }

    public Tarea buscarTarea(String nombre) {
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(nombre)) {
                return tarea;
            }
        }
        return null;
    }

/* funcion para realizar una tarea sin asignarle un colaborador
public boolean realizarTarea(Tarea t) {
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(t.getDescripcion())) {
                tarea.realizarTarea();
                return true;
            }
        }
        return false;
    }

 */

    public boolean realizarTarea(Tarea t, String nombreColaborador) {

        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(t.getDescripcion())) {
                for (Colaborador colaborador : colaboradores) {
                    if (colaborador.getNombre().equals(nombreColaborador)) {
                        tarea.realizarTarea(colaborador);
                        colaborador.realizarTarea(t);
                        colaboradores.add(colaborador);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        String acc = "\u001B[35mLISTA DE TAREAS\u001B[0m \n";
        for (Tarea tarea : tareas) {
            acc += tarea.toString() + "\n";
        }
        return acc;
    }

    private ArrayList<Tarea> tareasNoVencidas() {
        ArrayList<Tarea> tareasNoVencidas = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (!tarea.esVencida()) {
                tareasNoVencidas.add(tarea);
            }
        }
        return tareasNoVencidas;
    }

    private ArrayList<Tarea> ordenarTareas() {
        ArrayList<Tarea> tareasNoVencidas = tareasNoVencidas();
        Collections.sort(tareasNoVencidas, new Comparator<Tarea>() {
            @Override
            public int compare(Tarea tarea1, Tarea tarea2) {
                int comparacionPrioridad = tarea1.getPrioridad().compareTo(tarea2.getPrioridad());
                if (comparacionPrioridad != 0) {
                    return comparacionPrioridad;
                }
                return tarea1.getFechaLimite().compareTo(tarea2.getFechaLimite());
            }
        });

        return tareasNoVencidas;
    }

    public String mostrarOrdenadas() {
        String acc = "\u001B[35mLISTA DE TAREAS NO VENCIDAS ORDENADAS\u001B[0m \n";
        ArrayList<Tarea> tareasOrdenadas = ordenarTareas();
        for (Tarea tarea : tareasOrdenadas) {
            acc += tarea.toString() + " (" + tarea.getPrioridad() + ")\n";
        }
        return acc;
    }

    public void agregarColaborador(String nombre){
        Colaborador colaborador = new Colaborador(nombre);
        colaboradores.add(colaborador);
    }

    private Colaborador buscarColaborador(String nombre){
        for (Colaborador colaborador : colaboradores){
            if (colaborador.getNombre().equals(nombre))
                return colaborador;
        }
        return null;
    }

    public String verTareasDeColaborador(String nombre){
        Colaborador c = buscarColaborador(nombre);
        if (c != null){
            return c.toString();
        }
        return "No existe el colaborador";
    }
}
