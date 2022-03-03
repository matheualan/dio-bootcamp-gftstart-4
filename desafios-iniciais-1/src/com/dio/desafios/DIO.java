package com.dio.desafios;

import java.io.IOException;
import java.util.Scanner;

public class DIO {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double result = (B - A) / A * 100;
        System.out.printf("%.2f%%", result);
    }
}
