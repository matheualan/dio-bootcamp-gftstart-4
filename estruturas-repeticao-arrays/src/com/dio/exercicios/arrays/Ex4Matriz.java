package com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4Matriz {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] M4x4 = new int[4][4];

        for (int i = 0; i < M4x4.length; i++) {
            for (int j = 0; j < M4x4[i].length; j++) {
                M4x4[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha : M4x4) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }
}
