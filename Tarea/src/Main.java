import ar.edu.unlu.poo.tp1.tarea.*;

public class Main {
    public static void main(String[] args) {
        ListaDeTareas lista = new ListaDeTareas();
        lista.agregarColaborador("Valen");
        lista.agregarTarea("Ir al supermercado", Tarea.Prioridad.MEDIA, 30,10,2023);

        lista.agregarTarea("Consultar repuesto del auto", Tarea.Prioridad.MEDIA,28,8,2023);
        lista.realizarTarea("Consultar repuesto del auto", "Valen");

        lista.agregarTarea("Ir al cine a ver la nueva película de Marvel", Tarea.Prioridad.MEDIA,19,8,2023);


        System.out.println("PRUEBAS EJERCICIO 5: \n");
        System.out.println(lista.mostrarLista());

        System.out.println("\n PRUEBAS EJERCICIO 10 y 12: \n");
        lista.agregarTarea("Terminar TP", Tarea.Prioridad.MEDIA, 29,9,2023);
        lista.establecerFechaRecordatorio("Terminar TP", 20,9,2023);

        lista.agregarTarea("Estudiar", Tarea.Prioridad.MEDIA,29,9,2023);
        lista.establecerFechaRecordatorio("Estudiar", 30,8,2023);

        lista.agregarTarea("Dar final de arquitectura", Tarea.Prioridad.MEDIA, 2,12,2024);
        lista.establecerFechaRecordatorio("Dar final de arquitectura",5,11,2024);

        System.out.println(lista.mostrarListaOrdenada());

        System.out.println("PRUEBAS EJERCICIO 13: \n");

        lista.agregarTarea("Escuchar album nuevo de Blur", Tarea.Prioridad.MEDIA, 5,9,2023);
        lista.realizarTarea("Escuchar album nuevo de Blur", "Valen");

        System.out.println(lista.verTareasDeColaborador("Valen"));

    }
}