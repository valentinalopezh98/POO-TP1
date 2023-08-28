package ar.edu.unlu.poo.tp1.tarea;
import java.time.LocalDate;


public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private boolean estado = false;
    private LocalDate fechaLimite;
    private LocalDate recordatorio = null;
    public enum Prioridad {BAJA, MEDIA, ALTA}
    public Tarea (String descripcion, boolean estado, Prioridad prioridad){
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public void setRecordatorio(int dia, int mes, int anio){
        LocalDate fechaActual = LocalDate.now();
        this.recordatorio = LocalDate.of(anio,mes,dia);
        if(fechaActual.isAfter(recordatorio) || fechaActual.isEqual(recordatorio)){
            this.prioridad = Prioridad.ALTA;
        }
    }

    public boolean esCompleta(){
        return estado;
    }

    public void setFechaLimite(int dia, int mes, int anio) {
        this.fechaLimite = LocalDate.of(anio, mes, dia);
    }

    public boolean esVencida(){
        LocalDate fechaActual = LocalDate.now();
        return (fechaActual.isAfter(fechaLimite) && !estado);
    }

    public String mostrarTarea(){
        LocalDate fechaActual = LocalDate.now();
        String acumulador = "";
        if (this.esVencida()){
            acumulador += "\u001B[31m(Vencida)\u001B[0m ";
        }
        if (recordatorio != null){
            if (recordatorio.isAfter(fechaActual) || recordatorio.isEqual(fechaActual)){
                acumulador += "\u001B[33m(Por vencer)\u001B[0m ";
            }
        }

        acumulador += this.descripcion;
        return acumulador;
    }
}