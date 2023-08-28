import ar.edu.unlu.poo.tp1.tarea.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[35mLISTA DE TAREAS\u001B[0m");
        Tarea tarea = new Tarea("Ir al supermercado manana",false, Tarea.Prioridad.MEDIA );
        tarea.setFechaLimite(30,10,2023);
        System.out.println(tarea.mostrarTarea());

        Tarea tarea2 = new Tarea("Consultar repuesto del auto",true, Tarea.Prioridad.MEDIA);
        tarea2.setFechaLimite(19,8,2023);
        System.out.println(tarea2.mostrarTarea());

        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", false, Tarea.Prioridad.MEDIA);
        tarea3.setFechaLimite(19,8,2023);
        System.out.println(tarea3.mostrarTarea());

        Tarea tarea4 = new Tarea("Terminar TP", false, Tarea.Prioridad.ALTA);
        tarea4.setFechaLimite(29,9,2023);
        tarea4.setRecordatorio(20,9,2023);
        System.out.println(tarea4.mostrarTarea());
    }
}