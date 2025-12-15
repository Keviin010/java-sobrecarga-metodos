package org.poosobrecarga;

public class Calculadora {
    public int sumar(int a, int b){
        return a + b;
    }
    public int sumar(int... numeros){
        int total = 0;
        for (int num : numeros){
            total += num;
        }
        return total;
    }

    public float sumar (float a, float b){
        return a + b;
    }
    public float sumar (int j, float k){
        return j + k;
    }
    public float sumar (float l, int s){
        return l + s;
    }
    public double sumar(double a, double b){
        return a + b;
    }
    public long sumar(long a, long b){
        return a + b;
    }

    public int sumar(String a, String b){
        int resultado;
        try {
            resultado= Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }
    public int sumar(int a, int b, int c){
        return a + b + c;
    }
}
