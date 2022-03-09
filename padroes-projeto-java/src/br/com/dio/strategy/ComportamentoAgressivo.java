package br.com.dio.strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void locomover() {
        System.out.println("Locomovendo-se agressivamente.");
    }

}
