package com.dio.exerc02;

public class Quadrilatero {

    public static void area (double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area (double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado1 * lado2);

    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMenor + baseMaior) * altura) / 2);
    }

    public static void area(float lado1, float lado2) {
        System.out.println("Área do losango: " + lado1 * lado2);
    }

}
