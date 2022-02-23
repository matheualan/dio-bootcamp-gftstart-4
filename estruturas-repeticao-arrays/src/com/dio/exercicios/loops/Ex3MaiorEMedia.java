package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3MaiorEMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        double media;

        System.out.print("Informe 5 números: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(sc.nextLine());
            soma += numeros[i];
        }

        media = (double) soma / numeros.length;

        int maior = 0;
        int cont = 0;
        while (cont < numeros.length) {
            if (numeros[cont] > maior) {
                maior = numeros[cont];
            }
            cont++;
        }

        System.out.print("Números infomados: ");
        for (int i : numeros) {
            System.out.print(i + ", ");
        }

        System.out.println("\nMaior número informado: " + maior);
        System.out.println("Soma dos números informados: " + soma);
        System.out.println("Média dos números informados: " + media);

        int numero;
        int maiorNumero = 0;
        double sum = 0;
        int count = 0;
        do {
            System.out.println("Número: ");
            numero = sc.nextInt();
            sum += numero;
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            count++;
        } while (count < 5);
        System.out.println("Maior: " + maiorNumero);
        System.out.println("Média: " + sum / 5);

    }

}
