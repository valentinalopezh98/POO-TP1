import ar.edu.unlu.poo.tp1.ecuacion.Ecuacion;

public class Main {
    public static void main(String[] args) {
        //Ejemplo con una funcion que tiene dos raices reales
        System.out.println("\n\u001B[36mEcuacion 1: \u001B[0m");
        Ecuacion ecuacion1 = new Ecuacion(1,-5,6);
        System.out.println("Coeficiente A: " + ecuacion1.getCoeficienteA());
        System.out.println("Coeficiente B: " + ecuacion1.getCoeficienteB());
        System.out.println("Coeficiente C: " + ecuacion1.getCoeficienteC());
        int raices = ecuacion1.cantidadDeRaices();
        System.out.println("Cantidad de Raices distintas: " + (raices == -1? "Las raices son imaginarias" : raices));
        for (int i = 0; i < ecuacion1.cantidadDeRaices(); i++){
            int num = i + 1;
            System.out.println("Raiz " + num + ": " + ecuacion1.calcularRaices()[i]);
        }
        System.out.println("Valor de Y si X es 4: " + ecuacion1.calcularY(4));
        System.out.println("Valor de Y si X es -4: " + ecuacion1.calcularY(-4));
        System.out.println("Valor de Y si X es 0: " + ecuacion1.calcularY(0));

        //Ejemplo con una funcion que tiene una sola raiz
        System.out.println("\n\u001B[36mEcuacion 2: \u001B[0m");
        Ecuacion ecuacion2 = new Ecuacion(1,-4,4);
        System.out.println("Coeficiente A: " + ecuacion2.getCoeficienteA());
        System.out.println("Coeficiente B: " + ecuacion2.getCoeficienteB());
        System.out.println("Coeficiente C: " + ecuacion2.getCoeficienteC());
        raices = ecuacion2.cantidadDeRaices();
        System.out.println("Cantidad de Raices distintas: " + (raices == -1? "Las raices son imaginarias" : raices));
        for (int i = 0; i < ecuacion2.cantidadDeRaices(); i++){
            int num = i + 1;
            System.out.println("Raiz " + num + ": " + ecuacion2.calcularRaices()[i]);
        }
        System.out.println("Valor de Y si X es 4: " + ecuacion2.calcularY(4));
        System.out.println("Valor de Y si X es -4: " + ecuacion2.calcularY(-4));
        System.out.println("Valor de Y si X es 0: " + ecuacion2.calcularY(0));

        //Ejemplo con una funcion con raices imaginarias
        System.out.println("\n\u001B[36mEcuacion 3: \u001B[0m");
        Ecuacion ecuacion3 = new Ecuacion(1,4,5);
        System.out.println("Coeficiente A: " + ecuacion3.getCoeficienteA());
        System.out.println("Coeficiente B: " + ecuacion3.getCoeficienteB());
        System.out.println("Coeficiente C: " + ecuacion3.getCoeficienteC());
        raices = ecuacion3.cantidadDeRaices();
        System.out.println("Cantidad de Raices distintas: " + (raices == -1? "Las raices son imaginarias" : raices));
        for (int i = 0; i < ecuacion3.cantidadDeRaices(); i++){
            int num = i + 1;
            System.out.println("Raiz " + num + ": " + ecuacion3.calcularRaices()[i]);
        }
        System.out.println("Valor de Y si X es 4: " + ecuacion3.calcularY(4));
        System.out.println("Valor de Y si X es -4: " + ecuacion3.calcularY(-4));
        System.out.println("Valor de Y si X es 0: " + ecuacion3.calcularY(0));
    }

}
