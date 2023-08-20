package ar.edu.unlu.poo.tp1.tareas;
import java.time.LocalDate;


public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean estado = false;
    private LocalDate fechaLimite;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public boolean esCompleta(){
        return estado;
    }

    public void setFechaLimite(int dia, int mes, int anio) {
        LocalDate fechaLimite = LocalDate.of(anio, mes, dia);
        this.fechaLimite = fechaLimite;
    }

    public boolean esVencida(){
        LocalDate fechaActual = LocalDate.now();
        return (fechaActual.isAfter(fechaLimite) && !estado);
    }

    public String mostrarTarea(){
        String acumulador = "";
        if (this.esVencida()){
            acumulador += "(Vencida) ";
        }
        acumulador += this.descripcion;
        return acumulador;
    }
}

