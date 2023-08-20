import ar.edu.unlu.poo.tp1.tareas.Tarea;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[35mLISTA DE TAREAS\u001B[0m");
        Tarea tarea = new Tarea();
        tarea.setDescripcion("Ir al supermercado manana");
        tarea.setFechaLimite(30,10,2023);
        tarea.setEstado(false);
        System.out.println(tarea.mostrarTarea());

        Tarea tarea2 = new Tarea();
        tarea2.setDescripcion("Consultar repuesto del auto");
        tarea2.setEstado(true);
        tarea2.setFechaLimite(19,8,2023);
        System.out.println(tarea2.mostrarTarea());

        Tarea tarea3 = new Tarea();
        tarea3.setDescripcion("Ir al cine a ver la nueva película de Marvel");
        tarea3.setEstado(false);
        tarea3.setFechaLimite(19,8,2023);
        System.out.println(tarea3.mostrarTarea());
    }
}