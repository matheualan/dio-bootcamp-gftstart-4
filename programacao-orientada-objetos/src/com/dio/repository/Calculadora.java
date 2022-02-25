package com.dio.repository;

public class Calculadora implements OperacaoMat {

    @Override
    public void soma(double num1, double num2) {
        System.out.println("Adição: " + (num1 + num2));
    }

    @Override
    public void substracao(double num1, double num2) {
        System.out.println("Substração: " + (num1 - num2));
    }

    @Override
    public void multiplicacao(double num1, double num2) {
        System.out.println("Multiplicação: " + (num1 * num2));
    }

    @Override
    public void divisao(double num1, double num2) {
        System.out.println("Divisão: " + (num1 / num2));
    }

    @Override
    public void modulo(double num1, double num2) {
        OperacaoMat.super.modulo(num1, num2);
    }

}
