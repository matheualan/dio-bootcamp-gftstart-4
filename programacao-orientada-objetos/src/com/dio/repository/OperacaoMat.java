package com.dio.repository;

public interface OperacaoMat {

    void soma(double num1, double num2);

    void substracao(double num1, double num2);

    void multiplicacao(double num1, double num2);

    void divisao(double num1, double num2);

    default void modulo(double num1, double num2) {
        System.out.println("Resto da divisão: " + (num1 % num2));
    }

}
