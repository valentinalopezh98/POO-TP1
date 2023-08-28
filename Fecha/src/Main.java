import ar.edu.unlu.poo.tp1.fecha.Fecha;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        LocalDate resultado = fecha.devolverFecha("10-12-1998", "dd-MM-yyyy");
        System.out.println("Fecha 10-12-1998 parseada: " + resultado.toString());
        fecha.setFecha(28,11,2021);
        boolean esMenor, esMayor, entre;
        esMayor = fecha.esMayor(13,4,2023);
        esMenor = fecha.esMenor(13,4,2020);
        entre = fecha.estaEntre(13,4,2023,13,4,2020);
        System.out.println("El 13/04/2023 es mayor a 28/11/2021? " + esMayor);
        System.out.println("El 13/04/2020 es menor a 28/11/2021? " + esMenor);
        System.out.println("El 28/11/2021 esta entre 13/04/2020 y 13/04/2023? " + entre);
    }
}