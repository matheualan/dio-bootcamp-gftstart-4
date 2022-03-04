package br.com.dio;

import br.com.dio.exception.DivisaoNaoExataException;

import javax.swing.*;

public class ExceptionMain {
    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata.", numerador[i], denominador[i]);
                }
                int result = numerador[i] / denominador[i];
                System.out.println(result);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
                ae.getStackTrace();
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        System.out.println("O programa chegou aqui!");

    }
}
