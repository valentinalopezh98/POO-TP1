package ar.edu.unlu.poo.tp1.ecuacion;

import java.lang.reflect.Array;

public class Ecuacion {
    private float coeficienteA;
    private float coeficienteB;
    private float coeficienteC;

    public Ecuacion(float coeficienteA, float coeficienteB, float coeficienteC){
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public float getCoeficienteA() {
        return coeficienteA;
    }

    public float getCoeficienteB() {
        return coeficienteB;
    }

    public float getCoeficienteC() {
        return coeficienteC;
    }

    private float calcularRaiz(String metodo){
        float bcuadrado = (float) Math.pow(coeficienteB,2);
        float resta = (4 * coeficienteA * coeficienteC);
        float raiz = (float) Math.sqrt(bcuadrado - resta);
        float denominador = (2 * coeficienteA);
        if (metodo == "suma"){
            return ((- coeficienteB + raiz) / denominador);
        } else {
            return ((- coeficienteB - raiz) / denominador);
        }
    }

    public int cantidadDeRaices(){
        if (((Math.pow(coeficienteB,2)) - 4 * coeficienteA * coeficienteC) == 0 ){
            return 1;
        } else return 2;
    }
    public float[] calcularRaices(){;
        float[] miArreglo;
        if (cantidadDeRaices() == 1){
            miArreglo = new float[1];
            miArreglo[0] = calcularRaiz("suma");
        } else {
            miArreglo = new float[2];
            miArreglo[0] =calcularRaiz("suma");
            miArreglo[1]= calcularRaiz("resta");
        }
        return miArreglo;
    }

    public float calcularY(float x){
        return (float) (coeficienteA * Math.pow(x,2) + (coeficienteB * x) + coeficienteC);
    }
}
