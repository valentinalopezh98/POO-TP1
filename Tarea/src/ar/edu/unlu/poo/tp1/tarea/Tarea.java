package ar.edu.unlu.poo.tp1.tarea;
import java.time.LocalDate;


public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private boolean estado = false;
    private LocalDate fechaLimite;
    private LocalDate recordatorio = null;
    private LocalDate fechaFinalizacion = null;
    private Colaborador colaborador = null;
    public enum Prioridad {ALTA, MEDIA, BAJA}
    public Tarea (String descripcion, Prioridad prioridad){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public Tarea (String descripcion, Prioridad prioridad, int diaLimite, int mesLimite, int anioLimite){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = LocalDate.of(anioLimite,mesLimite,diaLimite);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void realizarTarea(Colaborador colaborador){
        estado = true;
        fechaFinalizacion = LocalDate.now();
        colaborador = colaborador;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
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

    public String mostrarDetalles(){
        return  "\u001B[36mDescripcion: \u001B[0m" + this.toString() +
                "\n\u001B[36mPrioridad: \u001B[0m" + prioridad +
                "\n\u001B[36mFecha de vencimiento: \u001B[0m" + getFechaLimite();
    }

    public String toString(){
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
        if (this.esCompleta()){
            acumulador += "\u001B[32m(Completada)\u001B[0m ";
        }

        acumulador += this.descripcion;
        return acumulador;
    }
}