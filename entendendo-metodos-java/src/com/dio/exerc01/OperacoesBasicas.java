package com.dio.exerc01;

public class OperacoesBasicas {

    private static double result = 0;

    public static void soma(int x, int y) {
//        result = x + y;
        System.out.println("Resultado de " + x + " + " + y + " é " + (x+y));
    }

    public static void subtracao(int x, int y) {
//        result = x - y;
        System.out.println("Resultado de " + x + " - " + y + " é " + (x-y));
    }

    public static void multiplicacao(double x, double y) {
        result = x * y;
        System.out.println("Resultado de " + x + " * " + y + " é " + result);
        System.out.printf("Resultado de %.0f * %.0f é %.0f\n", x, y, result);
    }

    public static void divisao(double x, double y) {
        result = x / y;
        System.out.println("Resultado de " + x + " / " + y + " é " + result);
        System.out.printf("Resultado de %.0f / %.0f é %.0f", x, y, result);
    }

}
