package br.com.dio.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void locomover() {
        System.out.println("Locomovendo-se normalmente.");
    }

}
