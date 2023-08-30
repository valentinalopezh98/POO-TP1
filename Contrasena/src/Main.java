import ar.edu.unlu.poo.tp1.contrasena.Contrasena;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese un numero
        System.out.print("Por favor, ingrese la cantidad de contraseñas a generar: ");
        int cantidad = scanner.nextInt();
        ArrayList<Contrasena> contrasenas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Contrasena contrasena = new Contrasena();
            contrasenas.add(contrasena);
        }
        System.out.println("\u001B[35mContrasenas generadas:\u001B[39m ");
        for (int i = 0; i < contrasenas.size(); i++){
            System.out.println("<" + contrasenas.get(i).getContrasena() + ">" +
                    (contrasenas.get(i).esSegura() ? " - \u001B[32mFuerte\u001B[39m" : "- \u001B[31mDébil\u001B[39m"));
        }

    }
}