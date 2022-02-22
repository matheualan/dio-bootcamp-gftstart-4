package com.dio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        double media;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            a = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            b = sc.nextDouble();
            sc.close();
        } catch (InputMismatchException e) {
            System.err.println("\n" + e.getMessage() + ". Para valores com ponto flutuante, separar por vírgula.");
        }
        media = (a * 3.5 + b * 7.5) / 11;
        System.out.printf("Média entre %.1f e %.1f foi de %.5f", a, b, media);
        System.out.println();

    }

}
