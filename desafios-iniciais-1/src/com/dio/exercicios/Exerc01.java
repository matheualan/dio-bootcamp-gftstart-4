package com.dio.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        double a = 0, y = 0, media;
//        double y = 0;
//        double media;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        y = sc.nextDouble();
        media = (a * 3.5 + y * 7.5) / 11;
        System.out.printf("MEDIA = %.5f", media);
    }
}
