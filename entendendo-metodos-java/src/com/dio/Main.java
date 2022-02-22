package com.dio;

import com.dio.exerc02.Quadrilatero;

public class Main {

    public static void main(String[] args) {

//        EXERCÍCIO 02
        System.out.println("Área do quadrado: " + Quadrilatero.area(4));
        System.out.println("Área do retângulo: " + Quadrilatero.area(6d, 6d));
        double trapezio = Quadrilatero.area(8, 7, 9);
        double losango = Quadrilatero.area(6f, 6f);
        System.out.println("Área do trapezio: " + trapezio);
        System.out.println("Área do losango: " + losango);


        /*
//        EXERCÍCIO 01
        OperacoesBasicas opBase = new OperacoesBasicas();
        opBase.soma(2, 2);
        opBase.subtracao(2, 1);
        opBase.multiplicacao(2, 3);
        opBase.divisao(6, 2);

        System.out.println("\n");

        Mensagem.verifiqueHorario(18);
        Mensagem.verifiqueHorario(12);
        Mensagem.verifiqueHorario(23.59);
        Mensagem.verifiqueHorario(24);

        System.out.println("\n");

        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        */

    }

}
