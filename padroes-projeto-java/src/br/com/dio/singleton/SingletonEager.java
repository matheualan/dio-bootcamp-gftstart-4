package br.com.dio.singleton;

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
