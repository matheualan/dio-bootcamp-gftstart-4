package com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2Consoantes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] letras = new String[6];
        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        System.out.println();
        System.out.println("## DIGITE 6 LETRAS DO ALFABETO ##");
        System.out.println("-----------------------------------");
        int count = 0;
        while (count < letras.length) {
            System.out.print((count+1) + "ª letra: ");
            letras[count] = sc.nextLine();
            if (! (letras[count].equalsIgnoreCase("a") ||
                    letras[count].equalsIgnoreCase("e") ||
                    letras[count].equalsIgnoreCase("i") ||
                    letras[count].equalsIgnoreCase("o") ||
                    letras[count].equalsIgnoreCase("u")) ) {
                    consoantes[count] = letras[count];
                    qtdConsoantes++;
            }
            count++;
        }
        sc.close();
        System.out.println("-----------------------------------");

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) System.out.print(consoante + " ");
        }

        System.out.println("\nQuantidade consoantes: " + qtdConsoantes);

    }
}
