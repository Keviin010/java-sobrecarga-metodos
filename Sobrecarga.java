package org.poosobrecarga;

public class Sobrecarga {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        System.out.println("Suma int: " + cal.sumar(25, 17));
        System.out.println("Suma float: " + cal.sumar(12.5f, 7.3f));
        System.out.println("Suma float-int: " + cal.sumar(8.5f, 4));
        System.out.println("Suma int-float: " + cal.sumar(20, 3.7f));
        System.out.println("Suma double: " + cal.sumar(100.75, 49.25));
        System.out.println("Suma long: " + cal.sumar(1_000_000L, 2_000_000L));
        System.out.println("Suma String: " + cal.sumar("30", "45"));
        System.out.println("Suma 3 int: " + cal.sumar(5, 10, 15));
    }
}
