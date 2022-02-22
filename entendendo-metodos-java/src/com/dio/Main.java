package com.dio;

import com.dio.base.Emprestimo;
import com.dio.base.Mensagem;
import com.dio.base.OperacoesBasicas;

public class Main {

    public static void main(String[] args) {
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

    }

}
