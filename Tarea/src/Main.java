import ar.edu.unlu.poo.tp1.tarea.*;

public class Main {
    public static void main(String[] args) {
        ListaDeTareas lista = new ListaDeTareas();
        lista.agregarColaborador("Valen");
        lista.agregarTarea("Ir al supermercado manana", Tarea.Prioridad.MEDIA );
        Tarea tarea1 = lista.buscarTarea("Ir al supermercado manana");
        tarea1.setFechaLimite(30,10,2023);


        lista.agregarTarea("Consultar repuesto del auto", Tarea.Prioridad.MEDIA);
        Tarea tarea2 = lista.buscarTarea("Consultar repuesto del auto");
        lista.realizarTarea(tarea2,"Valen");
        tarea2.setFechaLimite(19,8,2023);


        lista.agregarTarea("Ir al cine a ver la nueva película de Marvel", Tarea.Prioridad.MEDIA);
        Tarea tarea3 = lista.buscarTarea("Ir al cine a ver la nueva película de Marvel");
        tarea3.setFechaLimite(19,8,2023);

        lista.agregarTarea("Terminar TP", Tarea.Prioridad.ALTA);
        Tarea tarea4 = lista.buscarTarea("Terminar TP");
        tarea4.setFechaLimite(29,9,2023);
        tarea4.setRecordatorio(20,9,2023);

        lista.agregarTarea("Estudiar", Tarea.Prioridad.MEDIA);
        Tarea tarea5 = lista.buscarTarea("Estudiar");
        tarea5.setFechaLimite(29,9,2023);
        tarea5.setRecordatorio(30,8,2023);

        lista.agregarTarea("Dar final de arquitectura", Tarea.Prioridad.MEDIA);
        Tarea tarea6 = lista.buscarTarea("Dar final de arquitectura");
        tarea6.setFechaLimite(2,12,2024);
        tarea6.setRecordatorio(5,11,2024);


        System.out.println(lista);
        System.out.println(lista.mostrarOrdenadas());
        System.out.println(lista.verTareasDeColaborador("Valen"));
    }
}