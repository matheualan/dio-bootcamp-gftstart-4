package br.com.dio.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void locomover() {
        System.out.println("Locomovendo-se defensivamente.");
    }

}
