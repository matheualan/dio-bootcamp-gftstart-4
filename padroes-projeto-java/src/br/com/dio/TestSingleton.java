package br.com.dio;

import br.com.dio.singleton.SingletonEager;
import br.com.dio.singleton.SingletonLazy;
import br.com.dio.singleton.SingletonLazyHolder;

//        Testes relacionados ao Desing Pattern Singleton que deve retornar o endereço de memória igual para cada instância
public class TestSingleton {
    public static void main(String[] args) {


        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

    }
}
