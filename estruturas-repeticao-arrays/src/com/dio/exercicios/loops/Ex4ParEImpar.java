package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4ParEImpar {

    public static void main(String[] args) {

        int qtdNumeros = 0;
        int numero;
        int pares = 0, impares = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        qtdNumeros = Integer.parseInt(sc.nextLine());

        System.out.println("Informe os números: ");
        int count = 0;
        while (count < qtdNumeros) {
            numero = sc.nextInt();
            if (numero % 2 == 0) pares++;
            else impares++;
            count++;
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
        sc.close();

    }

}
