package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3MaiorEMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.print("Informe 5 números: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        int maior = 0;
        int cont = 0;
        while (cont < numeros.length) {
            if (numeros[cont] > maior) {
                maior = numeros[cont];
            }
            cont++;
        }

        System.out.println("Maior número informado: " + maior);

        System.out.print("Números infomados: ");
        for (int i : numeros) {
            System.out.print(i + ", ");
        }

//        int numero;
//        int maiorNumero = 0;
//        int count = 0;
//        do {
//            System.out.println("Número: ");
//            numero = sc.nextInt();
//            if (numero > maiorNumero) {
//                maiorNumero = numero;
//            }
//            count++;
//        } while (count < 5);
//        System.out.println("Maior número informado: " + maior);

    }

}
