package br.com.dio.gof;

/**
 * Singleton "Apressado"
 *
 * @author Matheus Alan
 */

public class SingletonEager {

    private static SingletonEager instanciaEager = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instanciaEager;
    }
}
