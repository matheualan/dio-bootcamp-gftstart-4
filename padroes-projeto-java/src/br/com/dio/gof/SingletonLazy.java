package br.com.dio.gof;

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
