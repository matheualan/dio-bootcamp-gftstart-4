package com.dio.exercicios;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i = 0; i <= numero; i = i + 2) {
            if (i > 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }

}
