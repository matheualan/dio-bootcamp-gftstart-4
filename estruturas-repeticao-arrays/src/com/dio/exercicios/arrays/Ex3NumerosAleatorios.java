package com.dio.exercicios.arrays;

import java.util.Random;

public class Ex3NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        System.out.println("Numeros aleatórios: ");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(50);
            System.out.print(numerosAleatorios[i] + "  ");
        }

        System.out.println("\nSucessores dos numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + "  ");
        }

        System.out.println("\nAntecessores dos numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + "  ");
        }

    }
}
