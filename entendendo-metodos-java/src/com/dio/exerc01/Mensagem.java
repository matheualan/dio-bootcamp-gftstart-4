package com.dio.exerc01;

public class Mensagem {

    public static void verifiqueHorario(double horaDoDia) {
        if (horaDoDia >= 5 && horaDoDia < 12) {
            System.out.println("Bom Dia !!!");
        } else if (horaDoDia >= 12 && horaDoDia < 18) {
            System.out.println("Boa Tarde !!!");
        } else if (horaDoDia >= 0 && horaDoDia < 5 || horaDoDia < 24) {
            System.out.println("Boa Noite !!!");
        } else {
            System.out.println("Hora inválida...");
        }
    }

}
