package ar.edu.unlu.poo.tp1.tarea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaDeTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();
    private ArrayList<Colaborador> colaboradores = new ArrayList<>();

    //Agregar tarea sin fecha limite
    public void agregarTarea(String descripcion, Tarea.Prioridad prioridad) {
        Tarea tarea = new Tarea(descripcion, prioridad);
        tareas.add(tarea);
    }

    //Agregar tarea con fecha limite
    public void agregarTarea(String descripcion, Tarea.Prioridad prioridad,int diaLimite,
                             int mesLimite, int anioLimite) {
        Tarea tarea = new Tarea(descripcion, prioridad, diaLimite,mesLimite,anioLimite);
        tareas.add(tarea);
    }

    //Busca la tarea en la lista y retorna la descripcion con mensajes si esta
    // por vencer, completada o vencida
    public String buscarTarea(String nombre) {
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(nombre)) {
                return tarea.toString();
            }
        }
        return null;
    }

    //Permite buscar una tarea y retorna los detalles como la descripcion,
    // prioridad y fecha limite
    public String buscarTareaDetalle(String nombre) {
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(nombre)) {
                return tarea.mostrarDetalles();
            }
        }
        return null;
    }

/* funcion orignal para realizar una tarea sin asignarle un colaborador
la funcion se comento ya que el enunciado dice "cuando se marca finalizada,
será realizada por un colaborador" por lo que no habria tareas que no sean
realizadas por colaboradores

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

    // Marca una tarea como completada y la agrega a la lista de tareas
    // completadas del colaborador pasado por parametro (si existe)
    public boolean realizarTarea(String nombreTarea, String nombreColaborador) {

        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(nombreTarea)) {
                for (Colaborador colaborador : colaboradores) {
                    if (colaborador.getNombre().equals(nombreColaborador)) {
                        tarea.realizarTarea(colaborador);
                        colaborador.realizarTarea(tarea);
                        colaboradores.add(colaborador);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //Permite establecer o modificar la fecha limite de una tarea
    public void establecerFechaLimite(String nombreTarea, int dia, int mes, int anio){
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(nombreTarea)) {
                tarea.setFechaLimite(dia,mes,anio);
            }
        }
    }

    //Permite modificar la descripcion de la tarea
    public void modificarDescripcion(String actual, String nueva){
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(actual)) {
                tarea.setDescripcion(nueva);
            }
        }
    }

    // permite modificar la prioridad de la tarea
    public void modificarPrioridad(String nombreTarea, Tarea.Prioridad prioridad){
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(nombreTarea)) {
                tarea.setPrioridad(prioridad);
            }
        }
    }

    // Retorna true si la tarea esta vencida y false si no lo esta
    public boolean esVencida(String nombreTarea){
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(nombreTarea)) {
                return tarea.esVencida();
            }
        }
        return false;
    }
    // Retorna true si la tarea esta completa y false si no lo esta
    public boolean esCompleta(String nombreTarea){
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(nombreTarea)) {
                return tarea.esCompleta();
            }
        }
        return false;
    }

    // funcion para establecer la fecha de recordatorio de una tarea
    public void establecerFechaRecordatorio(String nombreTarea, int dia, int mes, int anio){
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(nombreTarea)) {
                tarea.setRecordatorio(dia,mes,anio);
            }
        }
    }

    //funcion que devuelve un String con la lista de tareas sin detalles
    public String mostrarLista() {
        String acc = "\u001B[35mLISTA DE TAREAS\u001B[0m \n";
        for (Tarea tarea : tareas) {
            acc += tarea.toString() + "\n";
        }
        return acc;
    }

    //funcion privada que se utiliza para filtrar las tareas no vencidas
    private ArrayList<Tarea> tareasNoVencidas() {
        ArrayList<Tarea> tareasNoVencidas = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (!tarea.esVencida()) {
                tareasNoVencidas.add(tarea);
            }
        }
        return tareasNoVencidas;
    }

    //funcion privada que se utiliza para ordenar las tareas por prioridad
    // y luego por fecha de vencimiento
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

    //funcion que retorna un Strin con la lista de tareas no vencidas y ordenadas
    // con detalles sobre fecha limite, descripcion y prioridad para verificar
    // que la funcion ordenar funciona correctamente
    public String mostrarListaOrdenada() {
        String acc = "\u001B[35mLISTA DE TAREAS NO VENCIDAS ORDENADAS\u001B[0m \n";
        ArrayList<Tarea> tareasOrdenadas = ordenarTareas();
        for (Tarea tarea : tareasOrdenadas) {
            acc += tarea.mostrarDetalles() + "\n \n";
        }
        return acc;
    }

    // funcion para agregar colaboradores a la lista de tareas
    public void agregarColaborador(String nombre){
        Colaborador colaborador = new Colaborador(nombre);
        colaboradores.add(colaborador);
    }

    // funcion privada que permite buscar un colaborador por nombre
    private Colaborador buscarColaborador(String nombre){
        for (Colaborador colaborador : colaboradores){
            if (colaborador.getNombre().equals(nombre))
                return colaborador;
        }
        return null;
    }

    // funcion que devuelve un string con las tareas realizadas por el colaborador
    // que se pasa por parametro
    public String verTareasDeColaborador(String nombre){
        Colaborador c = buscarColaborador(nombre);
        if (c != null){
            return c.toString();
        }
        return "No existe el colaborador";
    }
}
