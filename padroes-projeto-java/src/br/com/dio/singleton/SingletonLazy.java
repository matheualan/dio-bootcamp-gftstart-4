package br.com.dio.singleton;

/**
 * Singleton "Preguiçoso"
 *
 * @author Matheus Alan
 */

public class SingletonLazy {

    private static SingletonLazy instanciaSingletonLazy;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instanciaSingletonLazy == null) instanciaSingletonLazy = new SingletonLazy();
        return instanciaSingletonLazy;
    }

}
