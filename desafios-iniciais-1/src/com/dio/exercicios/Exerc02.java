package com.dio.exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i = i + 2) {
            if (i % 2 == 0) System.out.print(i + ", ");
        }
        System.out.println(numero);
        sc.close();

    }

}
