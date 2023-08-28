package ar.edu.unlu.poo.tp1.fecha;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private LocalDate fecha = null;
    private DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    public void setFecha(int dia, int mes, int anio){
        this.fecha = LocalDate.of(anio, mes, dia);
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public LocalDate devolverFecha(String fecha, String formato){
        return LocalDate.parse(fecha, (formato.equals("dd-MM-yyyy") ? formato2 : formato2));
    }
    public boolean esMenor(int dia, int mes, int anio){
        LocalDate fechaAux = LocalDate.of(anio, mes, dia);
        return fechaAux.isBefore(fecha);
    }

    public boolean esMayor(int dia, int mes, int anio){
        LocalDate fechaAux = LocalDate.of(anio, mes, dia);
        return fechaAux.isAfter(fecha);
    }

    public boolean estaEntre(int dia1, int mes1, int anio1, int dia2, int mes2, int anio2){
        LocalDate fecha1 = LocalDate.of(anio1,mes1,dia1);
        LocalDate fecha2 = LocalDate.of(anio2, mes2, dia2);
        return (fecha.isAfter(fecha1) && fecha.isBefore(fecha2)) ||
                (fecha.isBefore(fecha1) && fecha.isAfter(fecha2));
    }



}
