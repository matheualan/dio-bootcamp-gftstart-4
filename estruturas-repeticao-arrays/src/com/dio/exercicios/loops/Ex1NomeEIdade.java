package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1NomeEIdade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            if (nome.equals("0")) break;
            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Encerrando programa...");

    }

}
