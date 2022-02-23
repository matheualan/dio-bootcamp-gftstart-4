package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2Nota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma nota de 0 a 10: ");
        int nota = Integer.parseInt(sc.nextLine());
        while (nota < 0 || nota > 10) {
            System.err.print("Informe um valor válido entre 0 e 10: ");
            nota = Integer.parseInt(sc.nextLine());
        }

    }
}
