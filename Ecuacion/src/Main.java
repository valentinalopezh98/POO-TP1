import ar.edu.unlu.poo.tp1.ecuacion.Ecuacion;

public class Main {
    public static void main(String[] args) {
        Ecuacion ecuacion = new Ecuacion(2,2,-4);
        System.out.println("Coeficiente A: " + ecuacion.getCoeficienteA());
        System.out.println("Coeficiente B: " + ecuacion.getCoeficienteB());
        System.out.println("Coeficiente C: " + ecuacion.getCoeficienteA());
        System.out.println("Cantidad de Raices: " + ecuacion.cantidadDeRaices());
        for (int i = 0; i < ecuacion.cantidadDeRaices(); i++){
            int num = i + 1;
            System.out.println("Raiz " + num + ": " + ecuacion.calcularRaices()[i]);
        }
        System.out.println("Valor de Y si X es 4: " + ecuacion.calcularY(4));
        System.out.println("Valor de Y si X es -4: " + ecuacion.calcularY(-4));
        System.out.println("Valor de Y si X es 0: " + ecuacion.calcularY(0));
    }

}
